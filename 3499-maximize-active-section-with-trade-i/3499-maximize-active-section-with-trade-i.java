class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                ones++;
            }
        }

        String t = "1" + s + "1";

        List<Character> chars = new ArrayList<>();
        List<Integer> lens = new ArrayList<>();

        for (char ch : t.toCharArray()) {
            if (chars.isEmpty() || chars.get(chars.size() - 1) != ch) {
                chars.add(ch);
                lens.add(1);
            } else {
                int last = lens.size() - 1;
                lens.set(last, lens.get(last) + 1);
            }
        }

        int bestGain = 0;

        for (int i = 1; i < chars.size() - 1; i++) {
            if (chars.get(i) == '1' &&
                chars.get(i - 1) == '0' &&
                chars.get(i + 1) == '0') {

                bestGain = Math.max(bestGain,
                        lens.get(i - 1) + lens.get(i + 1));
            }
        }

        return ones + bestGain;
    }
}