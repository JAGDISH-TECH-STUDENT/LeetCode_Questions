class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        boolean[][] isPal = new boolean[n][n];

        // Precompute palindromes
        for (int center = 0; center < n; center++) {
            expand(s, center, center, isPal); // odd length
            expand(s, center, center + 1, isPal); // even length
        }

        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = dp[i + 1]; // skip current
            for (int j = i + k - 1; j < n; j++) {
                if (isPal[i][j]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j + 1]);
                }
            }
        }
        return dp[0];
    }

    private void expand(String s, int l, int r, boolean[][] isPal) {
        int n = s.length();
        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            isPal[l][r] = true;
            l--;
            r++;
        }
    }
}
