class Solution {
    public int helper(int i, int amount, int[] coins, int[][] dp) {
        if (amount == 0)
            return 1;
        if (i >= coins.length || amount < 0)
            return 0;
        if (dp[i][amount] != -1)
            return dp[i][amount];
        return dp[i][amount] = helper(i, amount - coins[i], coins,dp) + helper(i + 1, amount, coins,dp);
    }
    public int change(int amount, int[] coins) {
        int dp[][] = new int[coins.length][amount+1];
        for(int[] it:dp) Arrays.fill(it,-1);
        return helper(0, amount, coins, dp);
    }
}
