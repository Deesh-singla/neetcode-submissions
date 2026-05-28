class Solution {
    public int helper(int i, int[] nums, int[] dp,int n) {
        if (i >= n)
            return 0;
        if (dp[i] != -1)
            return dp[i];
        return dp[i] = Math.max(nums[i] + helper(i + 2, nums, dp,n), helper(i + 1, nums, dp,n));
    }
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int x=helper(0,nums,dp,nums.length-1);
        Arrays.fill(dp, -1);
        int y=helper(1,nums,dp,nums.length);
        return Math.max(x,y);
    }
}
