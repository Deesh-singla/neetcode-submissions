class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char it = s.charAt(i);
            if ((it >= 65 && it <= 90) || (it >= 97 && it <= 122) || (it >= 48 && it <= 57)) {
                str += it;
            }
        }
        System.out.println(str);
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            char a = str.charAt(i);
            char b = str.charAt(j);
            if ((a>=65 && b>=65 && a<=122 && b<=122) && (a + 32 == b || a == b + 32))
                continue;
            if (str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }
}
