class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1); 

        int prefixSum = 0, result = 0;
        for (int num : nums) {
            prefixSum += (num % 2);
            result += countMap.getOrDefault(prefixSum - k, 0);
            countMap.put(prefixSum, countMap.getOrDefault(prefixSum, 0) + 1);
        }
        return result;
    }
}
