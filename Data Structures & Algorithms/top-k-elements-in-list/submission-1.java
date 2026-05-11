class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0) + 1);
        }
        for (int it : hmap.keySet()) {
            buckets[hmap.get(it)].add(it);
        }
        int[] ans = new int[k];
        int i = 0;

        for (int j = nums.length; j >= 0 && i < k; j--) {
            for (int num : buckets[j]) {
                if (i == k)
                    break;
                ans[i++] = num;
            }
        }
        return ans;
    }
}
