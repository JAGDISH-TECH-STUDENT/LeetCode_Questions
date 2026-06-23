class Solution {
    static final int MOD = 1_000_000_007;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        long[][][] dp = new long[n+1][2][m+1];

        // Initialize: arrays of length 1
        for (int x = 0; x < m; x++) {
            dp[1][0][x] = 1; // can go down next
            dp[1][1][x] = 1; // can go up next
        }

        for (int i = 1; i < n; i++) {
            long[] prefix = new long[m+1];
            long[] suffix = new long[m+1];

            // prefix sums for up transitions
            for (int x = 0; x < m; x++) {
                prefix[x+1] = (prefix[x] + dp[i][1][x]) % MOD;
            }
            // suffix sums for down transitions
            for (int x = m-1; x >= 0; x--) {
                suffix[x] = (suffix[x+1] + dp[i][0][x]) % MOD;
            }

            for (int y = 0; y < m; y++) {
                // up transition: x < y
                dp[i+1][0][y] = prefix[y];
                // down transition: x > y
                dp[i+1][1][y] = suffix[y+1];
            }
        }

        long ans = 0;
        for (int dir = 0; dir < 2; dir++) {
            for (int x = 0; x < m; x++) {
                ans = (ans + dp[n][dir][x]) % MOD;
            }
        }
        return (int) ans;
    }
}
