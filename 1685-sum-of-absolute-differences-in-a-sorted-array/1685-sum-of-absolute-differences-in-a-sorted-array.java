class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int left = i;
            int right = n - i - 1;

            if (left == 0) {
                ans[i] = Math.abs(nums[i]*right - (prefix[n - 1] - prefix[i]));
            }else if (right == 0) {
                ans[i] = Math.abs(nums[i]*left - (prefix[n - 2]));
            }else {
                ans[i] = Math.abs(nums[i]*left - prefix[i - 1]) + Math.abs(nums[i]*right - (prefix[n - 1] - prefix[i]));
            }
        }

        return ans;
    }
}