class Solution {
    public void dfs(int i, int j, int m, int n, int[][] grid, int[][] visited, int[] max) {
        max[0]++;
        visited[i][j] = 1;
        int row[] = {0, 0, -1, 1};
        int col[] = {1, -1, 0, 0};
        for (int k = 0; k < 4; k++) {
            int nr = i + row[k];
            int nc = j + col[k];
            if (nr >= 0 && nr < m && nc >= 0 && nc < n && visited[nr][nc] == 0
                && grid[nr][nc] == 1) {
                dfs(nr, nc, m, n, grid, visited,max);
            }
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == 0 && grid[i][j] == 1) {
                    int[] max = {0};
                    dfs(i, j, m, n, grid, visited, max);
                    count=Math.max(count,max[0]);
                }
            }
        }
        return count;
    }
}
