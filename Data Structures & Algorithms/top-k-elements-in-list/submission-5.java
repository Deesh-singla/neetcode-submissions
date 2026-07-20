class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int key : hmap.keySet()) {
            int freq = hmap.get(key);
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }
        int ans[]=new int[k];
        int ind=0;
        for(int i=nums.length;i>=0 && ind<k;i--){
            if(bucket[i]!=null){
                for(int it:bucket[i]){
                    ans[ind++]=it;
                    if(ind==k) break;
                }
            }
        }
        return ans;

    }
}
