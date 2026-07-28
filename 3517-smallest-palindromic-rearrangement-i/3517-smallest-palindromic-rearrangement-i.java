import java.util.*;

class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        char middle = 0;

        for (int i = 0; i < 26; i++) {
            int count = freq[i];
            // Add half of them to left
            for (int j = 0; j < count / 2; j++) {
                left.append((char)(i + 'a'));
            }
            // If odd, candidate for middle
            if (count % 2 == 1) {
                middle = (char)(i + 'a');
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(left);
        if (s.length() % 2 == 1) {
            result.append(middle);
        }
        result.append(left.reverse());

        return result.toString();
    }
}
