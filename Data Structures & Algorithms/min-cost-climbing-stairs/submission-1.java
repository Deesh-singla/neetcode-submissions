class Solution {
    public int helper(int i, int[] cost, int[] dp, int sum) {
        if (i >= cost.length)
            return 0;
        if (dp[i] != -1)
            return dp[i];
        return dp[i]=cost[i] + Math.min(helper(i + 1, cost, dp, sum), helper(i + 2, cost, dp, sum));
    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(helper(0, cost, dp, 0), helper(1, cost, dp, 0));
    }
}
