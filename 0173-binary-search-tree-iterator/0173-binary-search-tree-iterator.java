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
    List<Integer> list = new ArrayList<>();
    int curr = -1;
    public BSTIterator(TreeNode root) {
        fillList(root);
    }
    public void fillList(TreeNode node) {
        if (node == null) return;
        fillList(node.left);
        list.add(node.val);
        fillList(node.right);
    }

    public int next() {
        curr++;
        return list.get(curr);
    }
    
    public boolean hasNext() {
        return curr+1 < list.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */