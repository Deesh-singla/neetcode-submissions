class Solution {
    public void findMin(int[] nums, int l, int r, int min[]) {
        if (l > r)
            return;
        int mid = (l + r) / 2;
        if (nums[mid] >= nums[l]) {
            min[0] = Math.min(min[0], nums[l]);
            findMin(nums, mid + 1, r, min);
        } else {
            min[0] = Math.min(min[0], nums[mid]);
            findMin(nums, l, mid - 1, min);
        }
    }
    public int findMin(int[] nums) {
        int minValue[] = {Integer.MAX_VALUE};
        findMin(nums, 0, nums.length - 1, minValue);
        return minValue[0];
    }
}
