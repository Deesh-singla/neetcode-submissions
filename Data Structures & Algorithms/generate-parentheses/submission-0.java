class Solution {
    public void helper(int n,int ns,int nc,String str,List<String> list){
        if(ns==n && nc==n){
            list.add(str);
            return;
        }
        if(ns<n) helper(n,ns+1,nc,str+'(',list);
        if(nc<ns) helper(n,ns,nc+1,str+')',list);
    }
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        helper(n,0,0,"",list);
        return list;
        
    }
}
