class Solution {
    public int helper(int i, int prev, int[] nums, int[][] dp) {
        if (i == nums.length)
            return 0;
        if (dp[i][prev + 1] != -1)
            return dp[i][prev + 1];
        int x = 0;
        if (prev == -1 || nums[i] > nums[prev]) {
            x = 1 + helper(i + 1, i, nums,dp);
        }
        int y = helper(i + 1, prev, nums,dp);
        return dp[i][prev+1]=Math.max(x, y);
    }
    public int lengthOfLIS(int[] nums) {
        int dp[][] = new int[nums.length][nums.length + 1];
        for (int[] it : dp) Arrays.fill(it, -1);
        return helper(0, -1, nums, dp);
    }
}
