class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=0;
        right[nums.length-1]=0;
        int sum=0;
        int[] answer=new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
        
            sum+=nums[i];
            left[i+1]=sum;
        }
        int rev=0;
        for(int i=nums.length-2;i>=0;i--){
            
            rev+=nums[i+1];
            right[i]=rev;
        }
        for(int i=0;i<nums.length;i++){
            answer[i]=Math.abs(left[i]-right[i]);
        }
        return answer;

    }
}