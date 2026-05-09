class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            if (hmap.containsKey(s)) {
                hmap.get(s).add(strs[i]);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                hmap.put(s, list);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (String it : hmap.keySet()) {
            ans.add(new ArrayList<>(hmap.get(it)));
        }
        return ans;
    }
}
