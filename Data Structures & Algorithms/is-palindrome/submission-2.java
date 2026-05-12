class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char it = s.charAt(i);
            if ((it >= 65 && it <= 90) || (it >= 97 && it <= 122) || (it >= 48 && it <= 57)) {
                str.append(it);
            }
        }
        String st = str.toString();
        for (int i = 0, j = st.length() - 1; i < j; i++, j--) {
            char a = st.charAt(i);
            char b = st.charAt(j);
            if ((a >= 65 && b >= 65 && a <= 122 && b <= 122) && (a + 32 == b || a == b + 32))
                continue;
            if (a != b)
                return false;
        }
        return true;
    }
}
