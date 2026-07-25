class Solution {
    public int maxProduct(int n) {
        int l1=-1,l2=-1;
        while(n!=0){
            int digit=n%10;
            if(l1<=digit){
                l2=l1;
                l1=digit;
            }
            else if(l2<digit){
                l2=digit;
            }
            n/=10;
        }
        return l1*l2;
    }
}