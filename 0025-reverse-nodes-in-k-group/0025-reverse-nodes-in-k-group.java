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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        int size = getSize(head);
        int count = 0;
        ListNode prev = null;
        ListNode current = head;
        ListNode Next = head.next;
        while (size - count >= k) {
            ListNode last = prev;
            ListNode newEnd = current;
            for (int i = 0; i < k; i++) {
                current.next = prev;
                prev = current;
                current = Next;
                if (Next != null) {
                    Next = Next.next;
                }
            }
            //swapping has been done, now make the connection between pointers.
            if (last != null) {
                last.next = prev;
            }else {
                head = prev;
            }
            newEnd.next = current;
            prev = newEnd;
            count += k;
        }
        return head;
    
    }

    public int getSize(ListNode head) {
        ListNode last = head;
        int size = 0;
        while (last != null) {
            size++;
            last = last.next;
        }
        return size;
    }
}