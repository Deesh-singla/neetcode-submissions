class Pair {
    int x, y, d;
    Pair(int a, int b, int c) {
        x = a;
        y = b;
        d = c;
    }
}
class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    q.add(new Pair(i, j, 0));
                    visited[i][j] = 1;
                }
            }
        }
        int row[] = {0, 0, -1, 1};
        int col[] = {1, -1, 0, 0};
        while (!q.isEmpty()) {
            Pair curr = q.remove();
            for (int i = 0; i < 4; i++) {
                int nr = curr.x + row[i];
                int nc = curr.y + col[i];
                if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 2147483647
                    && visited[nr][nc] == 0) {
                    grid[nr][nc] = curr.d + 1;
                    visited[nr][nc] = 1;
                    q.add(new Pair(nr, nc, curr.d + 1));
                }
            }
        }
    }
}
