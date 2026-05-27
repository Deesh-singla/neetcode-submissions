class Solution {
    public void helper(
        int i, int[] nums, int target, int sum, List<List<Integer>> ans, List<Integer> list) {
            if(i==nums.length) return;
            if(sum==target){
                ans.add(new ArrayList<>(list));
                return;
            }
            if(sum+nums[i]<=target){
                list.add(nums[i]);
                helper(i,nums,target,sum+nums[i],ans,list);
                list.remove(list.size()-1);
            }
            helper(i+1,nums,target,sum,ans,list);
        }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(0, nums, target, 0, ans, list);
        return ans;
    }
}
