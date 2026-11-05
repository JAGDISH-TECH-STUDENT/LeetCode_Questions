class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int i=0;i<arr1.length;i++){
            int sum=0;
            boolean f=true;
            for(int j=0;j<arr2.length;j++){
                sum=Math.abs(arr1[i]-arr2[j]);
                if(sum<=d){
                    f=false;
                    break;
                }
            }
            if(f) count++;
             
        }
        return count;
    }
}