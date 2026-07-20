class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            // String str = Arrays.sort(strs[i]);
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String str=new String(arr);
            if (!hmap.containsKey(str)) {
                hmap.put(str, new ArrayList<>());
            }
            hmap.get(str).add(strs[i]);
        }
        for(String it:hmap.keySet()){
            list.add(hmap.get(it));
        }
        return list;
    }
}
