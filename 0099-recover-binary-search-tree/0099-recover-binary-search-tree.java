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
    TreeNode prev, first, second = null;
    public void recoverTree(TreeNode root) {
        recover(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    public void recover(TreeNode node) {
        if (node == null) return;

        recover(node.left);
        if (prev != null && node.val < prev.val) {
            if (first == null) {
                first = prev;
            }
            second = node;
        }
        prev = node;

        recover(node.right);
    }
}