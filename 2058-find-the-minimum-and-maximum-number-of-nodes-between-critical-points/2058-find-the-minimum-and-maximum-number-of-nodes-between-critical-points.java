class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;

        int index = 2;
        int first = -1;
        int last = -1;

        int minDistance = Integer.MAX_VALUE;
        int maxDistance = -1;

        while (curr.next != null) {
            boolean critical =
                (curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val);

            if (critical) {
                if (first == -1) {
                    first = index;
                } else {
                    minDistance = Math.min(minDistance, index - last);
                    maxDistance = index - first;
                }

                last = index;
            }

            prev = curr;
            curr = curr.next;
            index++;
        }

        if (maxDistance == -1) {
            return new int[]{-1, -1};
        }

        return new int[]{minDistance, maxDistance};
    }
}
