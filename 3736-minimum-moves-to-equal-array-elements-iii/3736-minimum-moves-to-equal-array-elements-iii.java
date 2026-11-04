class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.abs(nums[i]-max);
        }
        return sum;
    }
}