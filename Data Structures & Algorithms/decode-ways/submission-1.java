class Solution {
    public int helper(int i, String s, int[] dp) {
        if (i == s.length()) {
            return 1;
        }
        if (dp[i] != -1)
            return dp[i];
        StringBuilder x = new StringBuilder();
        int count = 0;
        for (int j = i; j < s.length(); j++) {
            x.append(s.charAt(j));
            if (x.charAt(0) == '0' || Double.parseDouble(x.toString()) > 26)
                continue;
            count += helper(j + 1, s, dp);
        }
        return dp[i] = count;
    }
    public int numDecodings(String s) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp,-1);
        return helper(0, s, dp);
    }
}
