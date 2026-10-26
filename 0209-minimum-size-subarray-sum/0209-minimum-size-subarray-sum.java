class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        long[] prefix = new long[n];
        prefix[0] = nums[0];
        
        for (int i = 1; i < n; i++) {
            prefix[i] = (long)nums[i] + prefix[i - 1];

        }

        if (prefix[n-1] < target) return 0;
        int i = 0;
        for (; i < n; i++) {
            if (prefix[i] >= target) {
                break;
            }
        }   
        int min = Integer.MAX_VALUE;
        for (; i < n; i++) {
            int index = binarySearch(prefix[i] - target, prefix, n);
            if (index == -1) {
                min = Math.min(min, i + 1);
            }else {
                min = Math.min(min, i - index);
            }
        }     
        return min;
    }

    int binarySearch(long target, long[] prefix, int n) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (prefix[mid] == target) {
                return mid;
            }else if (prefix[mid] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return end;

    }
}