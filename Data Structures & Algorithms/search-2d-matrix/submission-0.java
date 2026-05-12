class Solution {
    public int findRow(int[][] matrix, int target, int m, int n, int l, int r) {
        if (l > r) {
            return -1;
        }
        int mid = (l + r) / 2;
        if (target >= matrix[mid][0] && target <= matrix[mid][n - 1])
            return mid;
        else if (target >= matrix[l][0] && target <= matrix[mid][0])
            return findRow(matrix, target, m, n, l, mid - 1);
        else
            return findRow(matrix, target, m, n, mid + 1, r);
    }
    public boolean bs(int matrix[][], int row, int target, int l, int r) {
        if (l > r)
            return false;
        int mid = (l + r) / 2;
        if (matrix[row][mid] == target)
            return true;
        else if (matrix[row][l] <= target && matrix[row][mid] > target)
            return bs(matrix, row, target, l, mid - 1);
        else
            return bs(matrix, row, target, mid + 1, r);
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row=findRow(matrix, target, m, n, 0, m - 1);
        return row==-1?false:bs(matrix,row,target,0,n-1);

        // return false;
    }
}
