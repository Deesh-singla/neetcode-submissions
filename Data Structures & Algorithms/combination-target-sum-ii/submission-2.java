class Solution {
    public void helper(int i, int[] nums, int target, List<List<Integer>> ans, List<Integer> list) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1])
                continue;
            if (nums[j] > target)
                break;
            list.add(nums[j]);
            helper(j + 1, nums, target - nums[j], ans, list);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, candidates, target, ans, list);
        return ans;
    }
}
