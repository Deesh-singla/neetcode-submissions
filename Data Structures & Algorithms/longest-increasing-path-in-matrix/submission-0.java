class Solution {
    int[] row = {0, 0, -1, 1};
    int[] col = {1, -1, 0, 0};
    public int helper(int i, int j, int[][] matrix, int[][] visited, int m, int n) {
        int count = 0;
        for (int k = 0; k < 4; k++) {
            int nr = i + row[k];
            int nc = j + col[k];
            if (nr >= 0 && nr < m && nc >= 0 && nc < n && matrix[i][j] > matrix[nr][nc]
                && visited[nr][nc] < 1 + visited[i][j]) {
                visited[nr][nc] = 1 + visited[i][j];
                helper(nr, nc, matrix, visited, m, n);
            }
        }
        return visited[i][j];
    }
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;
        int[][] visited = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, helper(i, j, matrix, visited, m, n));
            }
        }
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // System.out.print(visited[i][j] + " ");
                max = Math.max(max, visited[i][j]);
            }
            // System.out.println();
        }
        return max + 1;
    }
}
