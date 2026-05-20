class Pair {
    int x, y, t;

    Pair(int a, int b, int c) {
        x = a;
        y = b;
        t = c;
    }
}

class Solution {
    public int bfs(Queue<Pair> q, int[][] visited, int[][] grid, int m, int n) {
        int maxT = 0;
        while (!q.isEmpty()) {
            Pair curr = q.remove();
            int[] row = { 0, 0, -1, 1 };
            int[] col = { 1, -1, 0, 0 };
            maxT = Math.max(maxT, curr.t);
            for (int k = 0; k < 4; k++) {
                int nr = curr.x + row[k];
                int nc = curr.y + col[k];
                if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1 &&
                 visited[nr][nc] != 1) {
                    visited[nr][nc] = 1;
                    q.add(new Pair(nr, nc, curr.t + 1));
                }
            }
        }
            return maxT;

    }

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];

        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    visited[i][j] = 1;
                    q.add(new Pair(i, j, 0));
                }
            }
        }

        int maxT = bfs(q, visited, grid, m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && visited[i][j] != 1)
                    return -1;
            }
        }

        return maxT;

    }
}