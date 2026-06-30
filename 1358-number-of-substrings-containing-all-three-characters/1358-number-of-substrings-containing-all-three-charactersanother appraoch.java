// Index Tracking Approach
// English: Track last seen index of a,b,c. At each step, min(lastA,lastB,lastC)+1 gives valid substrings.
// Hindi: Har character ka last index track karte hain. Minimum index +1 se valid substrings milte hain.

class Solution {
    public int numberOfSubstrings(String s) {
        int lastA = -1, lastB = -1, lastC = -1;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') lastA = i;
            if (c == 'b') lastB = i;
            if (c == 'c') lastC = i;
            int minIndex = Math.min(lastA, Math.min(lastB, lastC));
            if (minIndex != -1) {
                result += minIndex + 1;
            }
        }
        return result;
    }
}
