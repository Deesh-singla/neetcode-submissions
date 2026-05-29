class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1)
            return s.length();
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> hmap = new HashMap<>();
        int ans = 0;
        while (r < s.length()) {
            char ch = s.charAt(r);
            if (hmap.containsKey(ch)) {
                l = Math.max(l, hmap.get(ch) + 1);
            }
            hmap.put(ch, r);
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}
