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
    public int helper(TreeNode root, int[] maxSum) {
        if (root == null)
            return 0;
        int left = Math.max(0, helper(root.left, maxSum));
        int right = Math.max(0, helper(root.right, maxSum));

        maxSum[0] = Math.max(maxSum[0],
                root.val + left + right);

        return root.val + Math.max(left, right);
    }

    public int maxPathSum(TreeNode root) {
        if (root == null)
            return 0;
        int[] maxSum = { Integer.MIN_VALUE };
        helper(root, maxSum);
        return maxSum[0];
    }
}