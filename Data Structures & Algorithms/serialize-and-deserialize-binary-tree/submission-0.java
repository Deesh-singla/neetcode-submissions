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

public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return "";
        StringBuilder str = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.remove();

            if (node == null) {
                str.append("n-");
                continue;
            }

            str.append(node.val).append("-");

            q.add(node.left);
            q.add(node.right);
        }
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() == 0)
            return null;
        String[] arr = data.split("-");
        for (String it : arr) System.out.print(it + " ");
        // if (data.length() == 0)
        int i = 0;
        TreeNode nhead = new TreeNode(Integer.parseInt(arr[i]));
        Queue<TreeNode> q = new LinkedList<>();
        i++;
        q.add(nhead);
        while (!q.isEmpty()) {
            TreeNode head = q.remove();
            if (i < arr.length) {
                if (arr[i].equals("n")) {
                    head.left = null;
                    i++;
                } else {
                    head.left = new TreeNode(Integer.parseInt(arr[i]));
                    q.add(head.left);
                    i++;
                }
            }
            if (i < arr.length) {
                if (arr[i].equals("n")) {
                    head.right = null;
                    i++;
                } else {
                    head.right = new TreeNode(Integer.parseInt(arr[i]));
                    q.add(head.right);
                    i++;
                }
            }
        }
        return nhead;
    }
}
