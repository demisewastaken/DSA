/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.val == currentNode.next.val) {
                if (currentNode.next.next != null) {
                    currentNode.next = currentNode.next.next;
                }else {
                    currentNode.next = null;
                    return head;
                }
            }else {
                currentNode = currentNode.next;
            }
            
            
        }
        return head;

    }
}