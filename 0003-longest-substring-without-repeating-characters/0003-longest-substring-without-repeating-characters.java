class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0;
        int[] a=new int[256];
        int j=0;
        for(int i=0;i<s.length();i++){
            j=(a[s.charAt(i)]>0)? Math.max(j,a[s.charAt(i)]):j;
            a[s.charAt(i)]=i+1;
            r=Math.max(r,i-j+1);
        }
        return r;
    }
}