class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prevSum = 0;
        int count =0;
        for( int i = 0 ; i < nums.length ; i++){
            prevSum += nums[i];
            int diff = prevSum - k;
            if(map.containsKey(diff)){
                count += map.get(diff);
            }
            map.put(prevSum , map.getOrDefault(prevSum , 0) +1);
        }
    return count;    
    }
}