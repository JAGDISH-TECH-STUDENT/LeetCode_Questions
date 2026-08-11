class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1==nums[i]){
               sum+=nums[i];
            }else {
                break;
            }
        }
        HashSet<Integer> st=new HashSet<>();
        int max=sum;
        for(int s:nums){
           st.add(s); 
        }
        while(st.contains(max)){
            max++;
        }
        return max;
    
    }
}