class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        StringBuilder s=new StringBuilder();
        while(n>0){
            long digit=n%10;
            if(digit!=0){
               s.insert(0,digit);
            }
            sum+=digit;
            n/=10;
        }
        long multi=s.length()==0?0:Long.parseLong(s.toString());
        return multi*sum;
    }
}