class Solution {
   public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = max(piles);

        while (l < r) {
            int mid = l + (r - l) / 2;
            int hours = hours(piles, mid);
            if(hours<=h){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
   }
    public int max(int[] piles){
        int max=0;
        for(int pile: piles){
            max=Math.max(max,pile);
        }
        return max;
    }
    public int hours(int[] piles,int k){
        int hours=0;
        for(int pile:piles){
            hours+=Math.ceil((double)pile/k);
        }
        return hours;
    }

   

}