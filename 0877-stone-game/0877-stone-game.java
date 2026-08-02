class Solution {
    int [][]dp=new int[501][501];
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=piles[i];
        }
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int a=solve(piles,0,n-1,dp);
        int b=total-a;
        return ((a-b)>0)?true:false;

    }
    public int solve(int[] piles,int i,int j,int [][]dp){
        int n=piles.length;
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int take_i=piles[i]+Math.min(solve(piles,i+2,j,dp),solve(piles,i+1,j-1,dp));
        int take_j=piles[j]+Math.min(solve(piles,i+1,j-1,dp),solve(piles,i,j-2,dp));
        return dp[i][j]=Math.max(take_i,take_j);
    }
}