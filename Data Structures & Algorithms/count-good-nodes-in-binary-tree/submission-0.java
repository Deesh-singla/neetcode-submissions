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
    public void helper(TreeNode root,int maxV,int[] count){
        if(root==null) return;
        if(root.val>=maxV) count[0]++;
        helper(root.left,Math.max(maxV,root.val),count);
        helper(root.right,Math.max(maxV,root.val),count);
    }
    public int goodNodes(TreeNode root) {
        int count[]={0};
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        helper(root,Integer.MIN_VALUE,count);
        return count[0];
        
    }
}
