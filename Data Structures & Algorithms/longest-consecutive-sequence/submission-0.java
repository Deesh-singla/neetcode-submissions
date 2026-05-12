class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0) + 1);
        }
        int len = 0;
        for (int it : hmap.keySet()) {
            if (!hmap.containsKey(it - 1)) {
                int i=it;
                int count=0;
                while(hmap.containsKey(i)){
                    count++;
                    i++;
                }
                len=Math.max(len,count);
            }
        }
        return len;
    }
}
