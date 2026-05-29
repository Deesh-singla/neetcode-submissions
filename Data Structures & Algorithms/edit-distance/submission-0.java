class Solution {
    public int helper(int i, int j, String s, String t, int[][] dp) {
        if (i == s.length() && j == t.length())
            return 0;
        if (j == t.length()) {
            return s.length() - i;
        }
        if (i == s.length())
            return t.length() - j;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (s.charAt(i) == t.charAt(j))
            return dp[i][j] = helper(i + 1, j + 1, s, t, dp);
        else {
            int x = 1 + helper(i + 1, j, s, t, dp);
            int y = 1 + helper(i, j + 1, s, t, dp);
            int z = 1 + helper(i + 1, j + 1, s, t, dp);
            return dp[i][j] = Math.min(x, Math.min(y, z));
        }
    }
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for (int[] it : dp) Arrays.fill(it, -1);
        return helper(0, 0, word1, word2, dp);
    }
}
