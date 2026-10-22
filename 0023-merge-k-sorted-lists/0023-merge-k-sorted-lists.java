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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {
            ListNode head = lists[i];
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
        }

        Collections.sort(list);
        ListNode dummy = new ListNode(-99);
        ListNode current = dummy;
        for (int i = 0; i < list.size(); i++) {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        return dummy.next;

    }
}