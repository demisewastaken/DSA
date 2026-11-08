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
    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = binarySplit(nums, start, mid - 1);
        root.right = binarySplit(nums, mid + 1, end);
        return root;
    }

    public TreeNode binarySplit(int[] nums, int start, int end) {
        if (start > end) return null;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = binarySplit(nums, start, mid - 1);
            node.right = binarySplit(nums, mid + 1, end);
            return node;
        }
        return null;
    }
}