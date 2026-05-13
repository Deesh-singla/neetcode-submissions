class Solution {
    public int bs(int[] nums, int target, int l, int r) {
        if(l>r) return -1;
        int mid=(l+r)/2;
        if(nums[mid]==target) return mid;
        else if(nums[l]<=nums[mid]){
            if(target>=nums[l] && target<nums[mid]) return bs(nums,target,l,mid-1);
            else return bs(nums,target,mid+1,r);
        }
        else {
            if(target>nums[mid] && target<=nums[r]) return bs(nums,target,mid+1,r);
            else return bs(nums,target,l,mid-1);
        }
    }
    public int search(int[] nums, int target) {
        return bs(nums,target,0,nums.length-1);
    }
}
