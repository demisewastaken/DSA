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
    public ListNode partition(ListNode head, int x) {
            if (head == null) {
                return head;
            }
            ListNode current = head;
            ListNode smaller = new ListNode(-99);
            ListNode smallPointer = smaller;
            ListNode higher = new ListNode(99);
            ListNode highPointer = higher;
            while (current != null) {
                if (current.val >= x) {
                    highPointer.next = new ListNode(current.val);
                    highPointer = highPointer.next;
                }else {
                    smallPointer.next = new ListNode(current.val);
                    smallPointer = smallPointer.next;
                }
                current = current.next;
            }
            smallPointer.next = higher.next;
            return smaller.next;
    }
}