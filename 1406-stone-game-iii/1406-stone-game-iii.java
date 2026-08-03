class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        
        int[] t = new int[n + 1]; 
        // t[i] = Alice - Bob score difference starting at index i
        
        for (int i = n - 1; i >= 0; i--) {
            // Option 1: Take one stone
            t[i] = stoneValue[i] - t[i + 1];
            
            // Option 2: Take two stones
            if (i + 2 <= n) {
                t[i] = Math.max(t[i], stoneValue[i] + stoneValue[i + 1] - t[i + 2]);
            }
            
            // Option 3: Take three stones
            if (i + 3 <= n) {
                t[i] = Math.max(t[i], stoneValue[i] + stoneValue[i + 1] + stoneValue[i + 2] - t[i + 3]);
            }
        }
        
        int diff = t[0];
        if (diff < 0) {
            return "Bob";
        } else if (diff > 0) {
            return "Alice";
        }
        return "Tie";
    }
}
