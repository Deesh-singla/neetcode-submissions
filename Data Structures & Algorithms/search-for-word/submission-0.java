class Solution {
    public boolean helper(int i, int j, char[][] board, String word, int ind,int m,int n,int[][]visited) {
        if (ind == word.length())
            return true;
            visited[i][j]=1;
        int[] row = {1, -1, 0, 0};
        int[] col = {0, 0, 1, -1};
        for(int k=0;k<4;k++){
            int nr=i+row[k];
            int nc=j+col[k];
            if(nr>=0 && nr<m && nc>=0 && nc<n && visited[nr][nc]!=1 && word.charAt(ind)==board[nr][nc]){
                // visited[nr][nc]=1;
                if(helper(nr,nc,board,word,ind+1,m,n,visited)==true) return true;
            }
        }
        visited[i][j]=0;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    int visited[][] = new int[m][n];
                    if(helper(i, j, board, word, 1,m,n,visited)==true)return true;
                }
            }
        }
        return false;
    }
}
