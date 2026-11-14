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
    public boolean isValidBST(TreeNode root) {
        return helper(root.left, Long.MIN_VALUE, root.val) && helper(root.right, root.val, Long.MAX_VALUE);
    }
    public boolean helper(TreeNode node, long minValue, long maxValue) {
        if (node == null) return true;
        if (node.val > minValue && node.val < maxValue) {
            boolean left = helper(node.left, minValue, node.val);
            if (left == false) {
                return false;
            }
            return helper(node.right, node.val, maxValue);
        }else {
            return false;
        }
    }
}