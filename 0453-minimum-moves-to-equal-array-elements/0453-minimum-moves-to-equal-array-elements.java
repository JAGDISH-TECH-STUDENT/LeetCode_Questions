class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        long dis=0;
        for(int i=0;i<nums.length;i++){
            dis+=nums[i]-min;
        }
        return (int)dis;
    }
}