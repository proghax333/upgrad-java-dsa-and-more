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
    private int solve(TreeNode node, LinkedList<Integer> path) {
        if(node == null) {
            return Integer.MAX_VALUE;
        }

        int minValue = Integer.MAX_VALUE;

        for(int x : path) {
            int t = Math.abs(node.val - x);
            if(t < minValue) {
                minValue = t;
            }
        }

        path.offerLast(node.val);

        int leftMin = solve(node.left, path);
        int rightMin = solve(node.right, path);

        path.pollLast();

        return Math.min(minValue, Math.min(leftMin, rightMin));
    }

    public int getMinimumDifference(TreeNode root) {
        return solve(root, new LinkedList<Integer>());
    }
}