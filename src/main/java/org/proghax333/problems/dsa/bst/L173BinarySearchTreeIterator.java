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
class BSTIterator {
    Stack<TreeNode> stack;
    TreeNode p = null;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        p = root;
    }

    public int next() {
        while(p != null) {
            stack.push(p);
            p = p.left;
        }
        TreeNode x = stack.pop();
        p = x.right;
        return x.val;
    }

    public boolean hasNext() {
        return !stack.empty() || p != null;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */