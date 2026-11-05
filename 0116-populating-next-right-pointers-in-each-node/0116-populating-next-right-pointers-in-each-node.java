/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            for (int i = 0; i < Math.pow(2, level) - 1; i++) {
                Node current = queue.poll();
                current.next = queue.peek();
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
            Node current = queue.poll();
            current.next = null;
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
            level++;
        }
        return root;
    }
}