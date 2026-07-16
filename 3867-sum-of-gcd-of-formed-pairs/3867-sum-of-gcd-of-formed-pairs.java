class Solution {
    public long gcdSum(int[] nums) {
        long max=Long.MIN_VALUE;
        long gcd=0;
        long[] prefix=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                gcd=gc(max,nums[i]);
                prefix[i]=gcd;
            }else{
                gcd=gc(max,nums[i]);
                prefix[i]=gcd;
            }
        }
        Arrays.sort(prefix);
        long sum=0;
        int small=0,large=prefix.length-1;
        while(small<large){
            sum+=gc(prefix[small],prefix[large]);
            small++;
            large--;
        }
        return sum;
    }
    public long gc(long a ,long b ){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
            
        }
        return a;
    }
}