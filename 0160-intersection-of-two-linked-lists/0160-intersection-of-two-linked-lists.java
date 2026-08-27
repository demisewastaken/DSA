/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.HashMap;
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> map = new HashMap<>();

        ListNode current = headA;

        while (current != null) {
            map.put(current, current.val);
            current = current.next;
        }

        current = headB;

        while (current != null) {
            int temp = map.getOrDefault(current, -1);
            if (temp != -1) {
                return current;
            }
            current = current.next;
        }
        return null;


    }
}