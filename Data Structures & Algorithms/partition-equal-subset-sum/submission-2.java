class Solution {
    public boolean helper(int i,int nums[],int sum,Boolean dp[][]){
        if(sum==0) return  true;
        if(i==nums.length) return false;
        if(sum<0) return false;
        if(dp[i][sum]!=null) return dp[i][sum];
        boolean x=helper(i+1,nums,sum-nums[i],dp);
        boolean y=helper(i+1,nums,sum,dp);
        return dp[i][sum]=x||y;
    }
    public boolean canPartition(int[] nums) {
        // if(nums.length%2!=0) return false;
        int sum=0;
        for(int it:nums) sum+=it;
        if(sum%2!=0) return false;
        Boolean dp[][]=new Boolean[nums.length][(sum/2)+1];
        return helper(0,nums,sum/2,dp);
    }
}
