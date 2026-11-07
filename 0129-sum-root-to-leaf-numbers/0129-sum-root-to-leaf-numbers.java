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
    int finalSum = 0;
    public int sumNumbers(TreeNode root) {
        findSum(root, 0);
        return finalSum;
    }

    public void findSum(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        int num = root.val;
        sum = sum * 10 + num;
        if (root.left == null && root.right == null) {
            finalSum += sum;
            return;
        }
        findSum(root.left, sum);
        findSum(root.right, sum);
    }

}