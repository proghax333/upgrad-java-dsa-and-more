
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
    int k = 0;

    int solve(TreeNode root) {
        if(root == null) {
            return -1;
        }

        int solLeft = solve(root.left);

        if(solLeft >= 0) {
            return solLeft;
        }
        --k;

        if(k == 0) {
            return root.val;
        }

        return solve(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        return solve(root);
    }
}