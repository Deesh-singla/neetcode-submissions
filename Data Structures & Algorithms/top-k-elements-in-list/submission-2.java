class Pair{
    int val,count;
    Pair(int a,int b){
        val=a;
        count=b;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]=new int[k];
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->b.count-a.count);
        for(int it:hmap.keySet()){
            q.add(new Pair(it,hmap.get(it)));
        }
        for(int i=0;i<k;i++){
            ans[i]=q.remove().val;
        }
        return ans;

    }
}
