class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int r=0,l=0;
        int ans=0;
        int[] co=new int[26];
        while(r<n){
            int c=s.charAt(r)-'a';
            co[c]++;
            while(co[c]>2){
                int c1=s.charAt(l)-'a';
                co[c1]--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}