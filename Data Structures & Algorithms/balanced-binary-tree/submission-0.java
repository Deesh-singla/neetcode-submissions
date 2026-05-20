/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int helper(TreeNode root,boolean[] ans){
        if(root==null) return 0;
        int x=1+helper(root.left,ans);
        int y=1+helper(root.right,ans);
        if(Math.abs(x-y)>1) ans[0]=false;
        return Math.max(x,y);
    }
    public boolean isBalanced(TreeNode root) {
        boolean[] ans = {true};
        helper(root, ans);
        return ans[0];
    }
}
