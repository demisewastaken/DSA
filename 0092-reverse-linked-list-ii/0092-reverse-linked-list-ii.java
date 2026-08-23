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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }
        int count = 1;
        ListNode prev = null;
        ListNode current = head;
        ListNode Next = current.next;
        ListNode first = null;
        ListNode second = null;

        while (count <= right) {
            if (count == left - 1) {
                first = current;
            }else if (count == left) {
                second = current;
            }
            if (count >left && count <= right) {
                current.next = prev;
            }
            prev = current;
            current = Next;
            if (Next != null) {
                Next = Next.next;
            }
            count++;
        }
        //Fix the linkage using first and second nodes
        if (first != null) {
            first.next = prev;
        }else {
            head = prev;
        }
        second.next = current;

        return head;
    }

    
}