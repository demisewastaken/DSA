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
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode maxHead = head;
        ListNode current = head.next;
        int value = head.val;
        while (current != null) {
            if (current.val > value) {
                if (current.val > maxHead.val) {
                    maxHead = current;
                }else {
                    ListNode temp = maxHead;
                    while (true) {
                        if (temp.next.val < current.val) {
                            temp.next = current;
                            break;
                        }
                        temp = temp.next;
                    }

                }
            }
            value = current.val;
            current = current.next;
            
        }
        return maxHead;
    }
}