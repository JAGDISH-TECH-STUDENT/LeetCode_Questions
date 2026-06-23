class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        int index= insert(nums,target);
        return index;
    }
    public int insert(int[] nums, int target ){
        int index=0;     
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target ){
                index++;
                           
            }     
        }      
     
        return index;
    }
}