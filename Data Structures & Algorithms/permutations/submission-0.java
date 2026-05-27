class Solution {
    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void helper(int i, int[] nums, List<List<Integer>> ans) {
        if (i == nums.length) {
            List<Integer> list = new ArrayList<>();

            for (int num : nums) {
                list.add(num);
            }

            ans.add(list);
            return;
        }
        for (int j = i; j < nums.length; j++) {
            swap(i, j, nums);
            helper(i + 1, nums, ans);
            swap(i, j, nums);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, nums, ans);
        return ans;
    }
}
