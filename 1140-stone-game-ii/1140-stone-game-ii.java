class Solution {
    int[][][] dp = new int[2][101][101];
    public int stoneGameII(int[] piles) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 101; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return solve(piles,1,0,1,dp);
    }
    public int solve(int[] piles,int person,int i,int m,int[][][] dp){
        int n=piles.length;
        if(i>=n) return 0;
        if(dp[person][i][m]!=-1){
            return dp[person][i][m];
        }
        int stones=0;
        int result=(person==1)?-1:Integer.MAX_VALUE;
        for(int x=1;x<=Math.min(2*m,n-i);x++){
            stones+=piles[i+x-1];
            if(person==1){
                result=Math.max(result,stones+solve(piles,0,i+x,Math.max(m,x),dp));
            }
            else{
                result=Math.min(result,solve(piles,1,i+x,Math.max(m,x),dp));
            }
        }
        return dp[person][i][m]=result;
    }
}   