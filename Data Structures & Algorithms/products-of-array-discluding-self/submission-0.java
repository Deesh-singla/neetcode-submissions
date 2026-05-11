class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeros = 0;
        int pro = 1;
        for (int it : nums) {
            if (it == 0)
                zeros++;
            else 
            pro = pro * it;
        }
        if (zeros != 0 && zeros > 1)
            return new int[nums.length];
        if (zeros == 1) {
            int ans[] = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    ans[i] = pro;
                    break;
                }
            }
            return ans;
        }
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = pro / nums[i];
        }
        return ans;
    }
}
