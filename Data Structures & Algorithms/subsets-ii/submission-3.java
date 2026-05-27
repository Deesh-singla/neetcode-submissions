class Solution {
    public void helper(int i, int[] nums, List<Integer> list, List<List<Integer>> ans) {
        // if (i == nums.length) {
            ans.add(new ArrayList<>(list));
            // return;
        // }
        for (int j = i; j < nums.length; j++) {
            if(j>i && nums[j]==nums[j-1]) continue;
            list.add(nums[j]);
            helper(j+1,nums,list,ans);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(0, nums, list, ans);
        return ans;
    }
}
