class Solution {

    public int[] validSequence(String word1, String word2) {
        int n = word1.length(),
            m = word2.length();
        int[] suffix = new int[n];
        int i=n-1;
        int j = m - 1;
        int matched=0;
        while(i>=0){
            if(j>=0 && word1.charAt(i)==word2.charAt(j)){
                matched++;
                j--;
            }
            suffix[i]=matched;
            i--;
        }
        int[] result=new int[m];
        i=0;
        j=0;
        boolean power=true;
        int idx=0;
        while(i<n && j<m){
            if(word1.charAt(i)==word2.charAt(j)){
                result[idx]=i;
                idx++;
                j++;
            }
            else if(power == true && i+1<n && suffix[i+1]>=m-j-1){
                result[idx]=i;
                idx++;
                j++;
                power=false;
            }
            i++;
        }
        return (j==m) ? result:new int[0];
    }
}