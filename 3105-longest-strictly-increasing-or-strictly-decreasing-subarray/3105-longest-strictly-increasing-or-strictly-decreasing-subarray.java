class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int max = 1;
        for (int i = 0; i < n; i++) {
            boolean increasing = true;
            int count = 1;
            if (i + 1 >=n) {
                max = Math.max(max, count);
                break;
            }
            if (nums[i] == nums[i + 1]) continue;
            if (nums[i] > nums[i + 1]) {
                increasing = false;
            }
            int j = i + 1;
            for (; j < n; j++) {
                if (increasing && nums[j] > nums[j - 1]) {
                    count++;
                }else if (!increasing && nums[j] < nums[j - 1]) {
                    count++;
                }else {
                    max = Math.max(count, max);
                    break;
                }
            }
            max = Math.max(count, max);
            i = j - 2;
        }
        return max;
    }
}