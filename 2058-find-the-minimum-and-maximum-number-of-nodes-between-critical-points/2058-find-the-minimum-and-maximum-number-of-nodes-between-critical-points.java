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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int minIndex = -1;
        int maxIndex = -1;

        ListNode prev = head;
        ListNode current = head.next;
        int index = 2;
        int minCritical = -1;
        int maxCritical = -1;
        while (current.next != null) {
            if ((current.val > prev.val && current.val > current.next.val) || (current.val < prev.val && current.val < current.next.val)){
                if (maxIndex == -1 && minIndex == -1) {
                    if (maxCritical == -1) {
                        maxCritical = index;
                        minCritical = index;
                    }else {
                        maxIndex = index - maxCritical;
                        minIndex = maxIndex;
                        minCritical = index;
                    }
                }else {
                    minIndex = Math.min(minIndex, index - minCritical);
                    maxIndex = Math.max(maxIndex, index - maxCritical);
                    minCritical = index;
                }
            }
            index++;
            prev = current;
            current = current.next;
        }

        return new int[]{minIndex, maxIndex};
    }
}