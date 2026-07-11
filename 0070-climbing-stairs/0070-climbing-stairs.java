class Solution {
     Map<Integer,Integer> dp=new HashMap<>();
    public int climbStairs(int n) {
        return function(0,n);
    }
    public int function(int i,int n){
       
        if(i==n) return 1;
        if(i>n) return 0;
        if(dp.containsKey(i)) return dp.get(i);
        int a1=function(i+1,n);
        int a2=function(i+2,n);
        int ans=a1+a2;
        dp.put(i,ans);
        return ans;
    }
}