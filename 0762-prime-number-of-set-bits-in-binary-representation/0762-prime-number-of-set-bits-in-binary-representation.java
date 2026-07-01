class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int set=Integer.bitCount(i);
            if(prime(set)){
                count++;
            }
           
        }
        return count;
    }
    public boolean prime(int set){
        if(set<=1){
            return false;
        }
        for(int i=2;i*i<=set;i++){
            if(set%i==0){
                return false;
            }
            
        }
        return true;
    }
}