class Solution {
    public int helper(int i, int[] nums, int[] dp) {
        if (i >= nums.length)
            return 0;
        if (dp[i] != -1)
            return dp[i];
        return dp[i] = Math.max(nums[i] + helper(i + 2, nums, dp), helper(i + 1, nums, dp));
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+2];
        for(int i=nums.length-1;i>=0;i--){
            dp[i]=Math.max(nums[i]+dp[i+2],dp[i+1]);
        }

        return dp[0];
    }
}
