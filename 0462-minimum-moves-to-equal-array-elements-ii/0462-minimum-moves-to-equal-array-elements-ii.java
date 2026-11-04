class Solution {
    public int minMoves2(int[] nums) {
        int min=nums.length;
        Arrays.sort(nums);
        int dis=nums[min/2];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.abs(nums[i]-dis);
        }
        return sum;
    }
}