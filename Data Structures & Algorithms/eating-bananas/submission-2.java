class Solution {
    public int rate(int[] piles, int k) {
        int count = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] % k == 0)
                count = count + (piles[i] / k);
            else
                count = count + (piles[i] / k) + 1;
        }
        return count;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxValue = piles[0];
        for (int i = 1; i < piles.length; i++) {
            maxValue = Math.max(maxValue, piles[i]);
        }
        int l = 1;
        int r = maxValue;
        int ans = maxValue;
        while (l <= r) {
            int mid = (l + r) / 2;
            int cal = rate(piles, mid);
            if (cal <= h) {
                ans = Math.min(ans, mid);
                r = mid - 1;
            } else
                l = mid + 1;
        }
        return ans;
    }
}
