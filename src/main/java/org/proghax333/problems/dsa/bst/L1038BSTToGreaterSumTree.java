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
    private void getSortedArrayImpl(TreeNode node, List<Integer> result) {
        if(node != null) {
            getSortedArrayImpl(node.left, result);
            result.add(node.val);
            getSortedArrayImpl(node.right, result);
        }
    }

    public List<Integer> getSortedArray(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        getSortedArrayImpl(node, result);
        return result;
    }

    private TreeNode bstToGstImpl(TreeNode root, List<Integer> sortedList) {
        if(root == null) {
            return null;
        }
        int value = root.val;
        for(int x : sortedList) {
            if(x > root.val) {
                value += x;
            }
        }

        TreeNode node = new TreeNode(value);
        node.left = bstToGstImpl(root.left, sortedList);
        node.right = bstToGstImpl(root.right, sortedList);

        return node;
    }

    public TreeNode bstToGst(TreeNode root) {
        List<Integer> sortedList = getSortedArray(root);
        return bstToGstImpl(root, sortedList);
    }
}