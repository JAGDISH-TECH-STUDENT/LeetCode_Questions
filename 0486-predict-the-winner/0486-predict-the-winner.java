class Solution {
    int [][]dp=new int[23][23];
    public boolean predictTheWinner(int[] nums) {
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,nums.length-1,nums,dp)>=0;

    }
    public int solve(int i,int j,int[]nums,int[][] dp){
        if(i>j){
            return 0;
        }
        if(i==j){
            return nums[i];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int take_i=nums[i]-solve(i+1,j,nums,dp);
        int take_j=nums[j]-solve(i,j-1,nums,dp);
        return dp[i][j]=Math.max(take_i,take_j);

    }
}