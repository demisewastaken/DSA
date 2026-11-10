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
    List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return list;
    }

    public void helper(TreeNode node, StringBuilder temp) {
        if (node == null) {
            return;
        }

        int len = temp.length();

        if (temp.length() > 0) {
            temp.append("->");
        }

        temp.append(node.val);

        if (node.left == null && node.right == null) {
            list.add(temp.toString());
        } else {
            helper(node.left, temp);
            helper(node.right, temp);
        }

        // Backtracking
        temp.setLength(len);
    }
}