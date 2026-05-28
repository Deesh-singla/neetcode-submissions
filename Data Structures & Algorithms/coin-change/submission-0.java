class Solution {
    public int helper(int i, int[] coins, int amount, int[][] dp) {
        if (amount == 0)
            return 0;
        if (i >= coins.length || amount < 0)
            return Integer.MAX_VALUE;
        if (dp[i][amount] != -1)
            return dp[i][amount];
        int x = helper(i, coins, amount - coins[i], dp);
        if (x != Integer.MAX_VALUE)
            x = x + 1;
        int y = helper(i + 1, coins, amount, dp);
        return dp[i][amount] = Math.min(x, y);
    }
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length][amount+1];
        for (int[] it : dp) Arrays.fill(it, -1);
        int x = helper(0, coins, amount, dp);
        return x == Integer.MAX_VALUE ? -1 : x;
    }
}
