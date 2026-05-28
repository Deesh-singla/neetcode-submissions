class Solution {
    public int maxProduct(int[] nums) {
        int maxP = Integer.MIN_VALUE;
        int maxP2 = Integer.MIN_VALUE;
        int p = 1;
        int p2 = 1;
        for (int i = 0; i < nums.length; i++) {
            p = p * nums[i];
            if (p > maxP)
                maxP = p;
            if(p==0) p=1;
        }
        for(int i=nums.length-1;i>=0;i--){
            p2 = p2 * nums[i];
            if (p2 > maxP2)
                maxP2 = p2;
            if(p2==0) p2=1;
        }
        return Math.max(maxP,maxP2);
    }
}
