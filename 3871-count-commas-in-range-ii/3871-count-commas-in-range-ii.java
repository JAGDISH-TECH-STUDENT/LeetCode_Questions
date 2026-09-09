class Solution {
    public long countCommas(long n) {
        long commas = 0;

        if (n >= 1000) {
            commas += (Math.min(n, 9999) - 1000 + 1) * 1;
        }

        if (n >= 10000) {
            commas += (Math.min(n, 999999) - 10000 + 1) * 1;
        }

        if (n >= 1000000) {
            commas += (Math.min(n, 999999999) - 1000000 + 1) * 2;
        }

        if (n >= 1000000000) {
            commas += (Math.min(n, 999999999999L) - 1000000000 + 1) * 3;
        }

        if (n >= 1000000000000L) {
            commas += (Math.min(n, 999999999999999L) - 1000000000000L + 1) * 4;
        }

        if (n >= 1000000000000000L) {
            commas += (n - 1000000000000000L + 1) * 5;
        }

        return commas;
    }
}
