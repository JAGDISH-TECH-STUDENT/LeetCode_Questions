class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        boolean[] arr=new boolean[max+1];
        for(int i=0;i<nums.length;i++){
            if(!arr[nums[i]]){
                arr[nums[i]]=true;
            }
        }
         for(int i=min;i<=max;i++){
            if(!arr[i]){
                l.add(i);
            }
        }
        return l;
    }
}