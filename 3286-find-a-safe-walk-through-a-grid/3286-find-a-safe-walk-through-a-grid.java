import java.util.*;

class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size(), n = grid.get(0).size();
        int[][] maxHealth = new int[m][n];
        for (int[] row : maxHealth) Arrays.fill(row, -1);

        Queue<int[]> q = new LinkedList<>();
        int startHealth = health - grid.get(0).get(0);
        if (startHealth <= 0) return false;

        q.offer(new int[]{0, 0, startHealth});
        maxHealth[0][0] = startHealth;

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1], h = cur[2];

            if (x == m - 1 && y == n - 1 && h >= 1) return true;

            for (int[] d : dirs) {
                int nx = x + d[0], ny = y + d[1];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                    int nh = h - grid.get(nx).get(ny);
                    if (nh > 0 && nh > maxHealth[nx][ny]) {
                        maxHealth[nx][ny] = nh;
                        q.offer(new int[]{nx, ny, nh});
                    }
                }
            }
        }
        return false;
    }
}
