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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if ((p != null && q == null) || (p == null && q != null))
            return false;
        if (p.val != q.val)
            return false;
        boolean x = isSameTree(p.left, q.left);
        boolean y = isSameTree(p.right, q.right);
        return x && y;
    }
    public boolean helper(TreeNode root,TreeNode subRoot, boolean ans[]) {
        if (root == null)
            return false;
        if (root.val == subRoot.val){
            boolean a=isSameTree(root, subRoot);
            if(ans[0]==false) ans[0]=a;
        }
        boolean x = helper(root.left, subRoot,ans);
        boolean y = helper(root.right, subRoot,ans);
        return x || y;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean ans[]={false};
        helper(root,subRoot,ans);
        return ans[0];
    }
}
