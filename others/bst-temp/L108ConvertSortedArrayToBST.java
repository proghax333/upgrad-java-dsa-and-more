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
    public TreeNode sortedArrayToBST(int[] nums){
        if(nums.length == 0) {
            return null;
        }
        return bst(nums, 0, nums.length - 1);
    }

    public TreeNode bst(int[] nums, int st, int end) {
        if(st > end) {
            return null;  // Base case
        }

        int mid = (st + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);  // Middle element as root

        node.left = bst(nums, st, mid - 1);       // Build left subtree
        node.right = bst(nums, mid + 1, end);     // Build right subtree

        return node;
    }
}