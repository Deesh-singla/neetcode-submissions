class Pair {
    int val, weight;
    Pair(int a, int b) {
        val = a;
        weight = b;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> b.weight - a.weight);
        for (int it : hmap.keySet()) {
            q.add(new Pair(it, hmap.get(it)));
        }
        int i=0;
        while(!q.isEmpty() && i<k){
            ans[i]=q.remove().val;
            i++;
        }
        return ans;
    }
}
