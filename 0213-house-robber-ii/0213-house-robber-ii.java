class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
  
        int prev1 = nums[0];
        int prev2 = Math.max(nums[0], nums[1]);
        int result = prev2;
        for (int i = 2; i < n - 1; i++) {
            result = Math.max(nums[i] + prev1, prev2);
            prev1 = prev2;
            prev2 = result;
        }

        int prevResult = result;
        prev1 = nums[n - 1];
        prev2 = Math.max(nums[n - 1], nums[n - 2]);
        result = prev2;
        for (int i = n - 2 - 1; i > 0; i--) {
            result = Math.max(nums[i] + prev1, prev2);
            prev1 = prev2;
            prev2 = result;
        }

        return Math.max(prevResult, result);

    }
}