class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        boolean f=false;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]<min){
                min=nums1[i];
            }
        }
        for(int i=0;i<nums1.length;i++){
           
            if(nums1[i]%2!=0){
                f=true;
                break;
            }
        }
        if(min%2==0){
            if(f){
                return false;
            }
            
        }
        return true;
    }
}