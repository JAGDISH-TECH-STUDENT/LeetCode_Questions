import java.util.*;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        // dp[i][free] = max profit from index i with free status
        int[][] dp = new int[n][2];
        for (int[] row : dp) Arrays.fill(row, -1);
        return fun(nums, n, 0, 1, dp); // start at index 0, free = 1
    }

    private int fun(int[] a, int n, int i, int free, int[][] dp) {
        if (i == n) return 0; // base case

        if (dp[i][free] != -1) return dp[i][free];

        if (free == 0) {
            // अगर पिछला घर rob किया है, तो current घर skip करना पड़ेगा
            return dp[i][free] = fun(a, n, i + 1, 1, dp);
        }

        // Option 1: rob current house
        int c1 = a[i] + fun(a, n, i + 1, 0, dp);
        // Option 2: skip current house
        int c2 = fun(a, n, i + 1, 1, dp);

        return dp[i][free] = Math.max(c1, c2);
    }
}
