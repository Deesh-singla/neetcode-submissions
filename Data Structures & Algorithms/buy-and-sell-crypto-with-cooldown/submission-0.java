class Solution {
    public int helper(int i, int[] prices, int flag,int[][]dp) {
        if (i >= prices.length)
            return 0;
        if (dp[i][flag]!=-1) return dp[i][flag];
            if (flag == 0) {
                return dp[i][flag]= Math.max(-prices[i] + helper(i + 1, prices, 1,dp), helper(i + 1, prices, 0,dp));
            } else {
                return dp[i][flag]=Math.max(prices[i] + helper(i + 2, prices, 0,dp), helper(i + 1, prices, 1,dp));
            }
    }
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int[] it : dp)
            Arrays.fill(it, -1);
        return helper(0, prices, 0, dp);
    }
}
