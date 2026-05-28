class Solution {
    public boolean helper(int i,String s,Boolean[] dp,HashSet<String> set){
        if(i==s.length()) return true;
        if(dp[i]!=null) return dp[i];
        StringBuilder str=new StringBuilder();
        for(int j=i;j<s.length();j++){
            str.append(s.charAt(j));
            if(set.contains(str.toString())){
                if(helper(j+1,s,dp,set)==true) return dp[j]=true;
            }
        }
        return dp[i]=false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        Boolean dp[] = new Boolean[s.length()];
        return helper(0, s, dp,set);
    }
}
