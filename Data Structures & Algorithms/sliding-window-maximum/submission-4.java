class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1)
            return nums;
        int n = nums.length;
        int[] result = new int[n - k + 1];
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> nums[b] - nums[a]);
        for (int i = 0; i < k; i++) {
            q.add(i);
        }
        int l = 0;
        int r = k;
        int x = 0;
        while (r < nums.length) {
            while (q.peek() < l)
                q.remove();
            result[x] = nums[q.peek()];
            x++;
            l++;
            q.add(r);
            r++;
        }
        while(q.peek()<l) q.remove();
        result[n - k] = nums[q.peek()];
        return result;
    }
}