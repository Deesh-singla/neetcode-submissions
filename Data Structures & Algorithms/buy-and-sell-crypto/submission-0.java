class Solution {
    public int maxProfit(int[] prices) {
        int p = prices[0];
        int ans=0;
        for (int i = 1; i < prices.length; i++) {
            ans=Math.max(ans,prices[i]-p);
            if(prices[i]<p) p=prices[i];
        }
        return ans;
    }
}
