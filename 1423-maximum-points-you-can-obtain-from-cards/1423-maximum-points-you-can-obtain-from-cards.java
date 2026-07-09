class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        int curr=sum;
        for(int i=0;i<k;i++){
           sum=sum-cardPoints[k-1-i]+cardPoints[cardPoints.length-1-i];
            curr=Math.max(sum,curr);
            
        }
        return curr;
    }
}