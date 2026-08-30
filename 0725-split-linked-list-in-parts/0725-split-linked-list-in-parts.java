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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (size <= k) {
            temp = head;
            int i = 0;
            for (; i < size; i++) {
                ans[i] = new ListNode(temp.val);
                temp = temp.next;
            }
            for (; i < k; i++) {
                ans[i] = null;
            }
        }else {
            int extra = size % k;
            int i = 0;
            temp = head;
            while (i < k) {
                ListNode start = temp;
                ListNode end = start;
                for (int j = 1; j < size / k; j++) {
                    end = end.next;
                }
                if (extra > 0) {
                    end = end.next;  
                    extra--;
                }
                temp = end.next;
                end.next = null;
                ans[i] = start;
                i++;
            }
        }
        return ans;
    }
}