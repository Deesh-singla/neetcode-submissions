class Solution {
    public boolean check(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
    public void helper(int i, String s, List<String> list, List<List<String>> ans) {
        if (i == s.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }
        StringBuilder x = new StringBuilder();
        for (int j = i; j < s.length(); j++) {
            x.append(s.charAt(j));
            if (check(x.toString())) {
                list.add(x.toString());
                helper(j + 1, s, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        helper(0, s, list, ans);
        return ans;
    }
}
