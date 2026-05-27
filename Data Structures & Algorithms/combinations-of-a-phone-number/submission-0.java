class Solution {
    public void helper(int i, String digits, String[] arr, List<String> ans, String str) {
        if (i == digits.length()) {
            ans.add(str);
            return;
        }
        String d = arr[(int)(digits.charAt(i)-'0')];
        for (int j = 0; j < d.length(); j++) {
            helper(i + 1, digits, arr, ans, str + d.charAt(j));
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length()==0) return list;
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        helper(0, digits, arr, list, "");
        return list;
    }
}
