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
    public TreeNode solve(TreeNode root, TreeNode n) {
        if(root == null) {
            return n;
        }

        n = solve(root.left, n);
        n.right = new TreeNode(root.val);
        n = solve(root.right, n.right);

        return n;
    }

    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode();

        solve(root, dummy);

        return dummy.right;
    }
}