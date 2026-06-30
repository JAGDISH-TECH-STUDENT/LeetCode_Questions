// Sliding Window Approach
// English: Expand window until all three chars present, then shrink from left
// Hindi: Window ko expand karte hain jab tak 'a','b','c' na mil jaye, phir left se shrink karte hain

class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq = new int[3]; // count of a,b,c
        int left = 0, result = 0;
        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']++;
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                result += s.length() - right; // all substrings ending at right are valid
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return result;
    }
}
