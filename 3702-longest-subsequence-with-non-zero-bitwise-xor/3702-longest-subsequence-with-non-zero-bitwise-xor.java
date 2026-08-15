class Solution {
    public int longestSubsequence(int[] nums) {
        int total = 0;
        boolean hasNonZero = false;
        for (int num : nums) {
            total ^= num;
            if (num != 0) hasNonZero = true;
        }
        if (total != 0) {
            return nums.length;
        } else if (hasNonZero) {
            return nums.length - 1;
        } else {
            return 0;
        }
    }
}