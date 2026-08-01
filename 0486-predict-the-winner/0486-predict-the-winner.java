class Solution {
    int [][]dp=new int[23][23];
    public boolean predictTheWinner(int[] nums) {
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        int player1=solve(0,nums.length-1,nums,dp);
        int player2=totalSum-player1;
        return player1>=player2;

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

        int take_i=nums[i]+Math.min(solve(i+2,j,nums,dp),solve(i+1,j-1,nums,dp));
        int take_j=nums[j]+Math.min(solve(i+1,j-1,nums,dp),solve(i,j-2,nums,dp));
        return dp[i][j]=Math.max(take_i,take_j);

    }
}