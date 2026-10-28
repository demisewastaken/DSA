class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = nums[0];
        suffix[n - 1] = nums[n - 1];
        int moves = Integer.MAX_VALUE;
        if (prefix[0] == x || suffix[n - 1] == x) return 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
            if (prefix[i] == x) moves = Math.min(moves, i + 1);
            suffix[n - 1 - i] = suffix[n - i] + nums[n - i - 1];
            if (suffix[n - 1 - i] == x) moves = Math.min(moves, i + 1);
        }

        for (int i = 0; i < n; i++) {
            int index = binarySearch(suffix, x - prefix[i], i + 1, n - 1);
            if (index != -1) {
                moves = Math.min(moves, n - index + i + 1);
            }
        }
        if (moves == Integer.MAX_VALUE) return -1;
        return moves;
    }
    int binarySearch(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) return mid;

            if (array[mid] > target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        } 
        return -1;
    }
}