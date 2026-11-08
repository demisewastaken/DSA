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
    int min = Integer.MAX_VALUE;
    TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return min;
    }
    public void helper(TreeNode node) {
        if (node == null) return;

        helper(node.left);
        if (prev != null) {
            min = Math.min(min, Math.abs(prev.val - node.val));
        }
        prev = node;
        helper(node.right);
    } 
}