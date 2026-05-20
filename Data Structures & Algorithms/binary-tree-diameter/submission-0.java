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
    public int helper(TreeNode root,int[] maxV){
        if(root==null) return -1;
        int x=1+helper(root.left,maxV);
        int y=1+helper(root.right,maxV);
        maxV[0]=Math.max(maxV[0],x+y);
        return Math.max(x,y);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int maxV[]={0};
        helper(root,maxV);
        return maxV[0];
        
    }
}
