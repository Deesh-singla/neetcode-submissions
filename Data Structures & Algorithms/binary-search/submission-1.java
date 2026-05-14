class Solution {
    public int bs(int[] nums,int target,int l,int r){
        if(l>r) return -1;
        int mid=(l+r)/2;
        if(target==nums[mid]) return mid;
        else if(nums[mid]>target) return bs(nums,target,l,mid-1);
        else return bs(nums,target,mid+1,r);
    }
    public int search(int[] nums, int target) {
        return bs(nums,target,0,nums.length-1);
    }
}
