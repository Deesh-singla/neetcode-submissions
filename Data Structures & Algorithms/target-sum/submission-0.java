class Solution {
    public int helper(int i, int[] nums, int target, int total, int[][] dp,int sum) {
        if (target == sum && i == nums.length)
            return 1;
        if (i >= nums.length )
            return 0;
        if (dp[i][sum+ total] != -1)
            return dp[i][sum + total];
        return dp[i][sum + total] = helper(i + 1, nums, target, total, dp,sum+nums[i])
            + helper(i + 1, nums, target, total, dp,sum-nums[i]);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int it : nums) sum += it;
        int dp[][] = new int[nums.length][sum * 2 + 1];
        for (int[] it : dp) Arrays.fill(it, -1);
        return helper(0, nums, target, sum, dp,0);
    }
}

