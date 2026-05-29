class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int ans = 0;
        int maxF = 0;
        HashMap<Character, Integer> hmap = new HashMap<>();
        while (r < s.length()) {
            hmap.put(s.charAt(r), hmap.getOrDefault(s.charAt(r), 0) + 1);
            maxF = Math.max(maxF, hmap.get(s.charAt(r)));
            while (r - l + 1 - maxF > k) {
                hmap.put(s.charAt(l), hmap.get(s.charAt(l)) - 1);
                l++;
            }
            if (r - l + 1 - maxF <= k)
                ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}
