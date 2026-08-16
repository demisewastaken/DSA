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
 import java.util.Arrays;

class Solution {
    public int numComponents(ListNode head, int[] nums) {
        int components = 0;
        Arrays.sort(nums);
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            boolean found = binarySearch(nums, temp.val);
            if (found) {
                count++;
            } else {
                if (count != 0) {
                    components++;
                    count = 0;
                }
            }
            temp = temp.next;
        }
        if (count != 0) {
            components++;
        }
        return components;
    }

    public boolean binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return true;
            }else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}