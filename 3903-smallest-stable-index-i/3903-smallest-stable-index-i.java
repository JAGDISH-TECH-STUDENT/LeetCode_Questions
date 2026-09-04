class Solution {
    public int firstStableIndex(int[] nums, int k) {
       
        for(int i=0;i<nums.length;i++){
             int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                max=Math.max(nums[j],max);
            }
            for(int n=i;n<nums.length;n++){
                min=Math.min(nums[n],min);
            }
            if((max-min) <= k){
                return i;
            }
            
        }
        return -1;
    }
}