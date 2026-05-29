class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        HashMap<Character, Integer> hmap1 = new HashMap<>();
        HashMap<Character, Integer> hmap2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            hmap1.put(s1.charAt(i),
                    hmap1.getOrDefault(s1.charAt(i), 0) + 1);

            hmap2.put(s2.charAt(i),
                    hmap2.getOrDefault(s2.charAt(i), 0) + 1);
        }

        if (hmap1.equals(hmap2))
            return true;

        int l = 0;

        for (int r = s1.length(); r < s2.length(); r++) {

            // Add new character
            hmap2.put(s2.charAt(r),
                    hmap2.getOrDefault(s2.charAt(r), 0) + 1);

            // Remove left character
            char left = s2.charAt(l);
            hmap2.put(left, hmap2.get(left) - 1);

            if (hmap2.get(left) == 0)
                hmap2.remove(left);

            l++;

            if (hmap1.equals(hmap2))
                return true;
        }

        return false;
    }
}