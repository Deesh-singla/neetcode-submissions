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
    public void helper(TreeNode root,TreeNode newRoot){
        if(root==null) return;
        if(root.left!=null){
            newRoot.right=new TreeNode(root.left.val);
            helper(root.left,newRoot.right);
        }
        if(root.right!=null){
            newRoot.left=new TreeNode(root.right.val);
            helper(root.right,newRoot.left);
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        if(root.left==null && root.right==null) return root;
        TreeNode newRoot=new TreeNode(root.val);
        helper(root,newRoot);
        return newRoot;
        
    }
}
