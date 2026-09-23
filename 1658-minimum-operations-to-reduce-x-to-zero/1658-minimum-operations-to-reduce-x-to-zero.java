class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int i=0;i<nums.length;i++){
           total+=nums[i];
        }
        int target=total-x;
        if(target==0) return nums.length;
        int sum=0, left=0,max=-1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>target && left<=i){
                sum-=nums[left];
                left++;
            }
            if(sum==target){
                max=Math.max(max,i-left+1);
            }
            
        }
        return max==-1?-1:nums.length-max;
    }
}
