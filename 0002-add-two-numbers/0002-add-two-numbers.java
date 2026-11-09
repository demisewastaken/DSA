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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-99);
        ListNode dummy = head;
        int sum;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int num1 = 0;
            int num2 = 0;
            if (l1 != null) {
                num1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                num2 = l2.val;
                l2 = l2.next;
            }
            sum = num1 + num2 + carry;
            carry = sum / 10;
            if (head.val == -99) {
                head.val = sum % 10;
            }else {
                dummy.next = new ListNode(sum % 10);
                dummy = dummy.next;
            }
        }
        if (carry != 0) {
            dummy.next = new ListNode(carry);
            dummy = dummy.next;
        }
        return head;
    }
}