class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        long ans = 0;
        
        // Transform array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (nums[i] == target) ? 1 : -1;
        }
        
        // Prefix sum + TreeMap for counts
        long prefix = 0;
        TreeMap<Long, Integer> map = new TreeMap<>();
        map.put(0L, 1); // base case
        
        for (int x : arr) {
            prefix += x;
            // Count how many earlier prefixes are < current prefix
            ans += map.headMap(prefix, false).values().stream().mapToInt(Integer::intValue).sum();
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        
        return (int)ans;
    }
}