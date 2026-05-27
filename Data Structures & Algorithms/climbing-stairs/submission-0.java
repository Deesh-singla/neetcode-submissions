class Solution {
    public int climbStairs(int n) {
        int a=0;
        int b=1;
        int c=0;
        while(c!=n){
            int x=a+b;
            a=b;
            b=x;
            c++;
        }
        return b;
        
    }
}
