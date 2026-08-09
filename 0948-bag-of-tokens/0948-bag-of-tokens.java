class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int maxScore=0;
        int score=0;
        int i=0,j=tokens.length-1;
        Arrays.sort(tokens);
        while(i<=j){
            if(power>=tokens[i]){    // faceup or power > token
                power-=tokens[i];
                score++;
                i++;
                maxScore=Math.max(score,maxScore);
            }
            else if(score>=1){   // faceDown or power < token
                power+=tokens[j];
                score--;
                j--;
            }
            else{
                return maxScore;
            }
        }
        return maxScore;
    }
}