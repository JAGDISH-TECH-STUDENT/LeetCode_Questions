class Solution {
    int[] prefix;
    Integer[][] memo;

    public int stoneGameV(int[] stones) {
        int n = stones.length;
        prefix = new int[n + 1];
        for (int i = 0; i < n; i++) prefix[i + 1] = prefix[i] + stones[i];

        memo = new Integer[n][n];
        return solve(0, n - 1);
    }

    private int sum(int i, int j) { // inclusive sum of stones[i..j]
        return prefix[j + 1] - prefix[i];
    }

    private int solve(int i, int j) {
        if (i == j) return 0; // single stone, nothing more to score
        if (memo[i][j] != null) return memo[i][j];

        int best = 0;
        for (int k = i; k < j; k++) {
            int leftSum = sum(i, k);
            int rightSum = sum(k + 1, j);

            if (leftSum < rightSum) {
                best = Math.max(best, leftSum + solve(i, k));
            } else if (leftSum > rightSum) {
                best = Math.max(best, rightSum + solve(k + 1, j));
            } else {
                best = Math.max(best, leftSum + solve(i, k));
                best = Math.max(best, rightSum + solve(k + 1, j));
            }
        }

        return memo[i][j] = best;
    }
}