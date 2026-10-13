import java.util.Arrays;
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        Arrays.sort(nums);

        int i = 0;
        int j = n - 1;
        long ans = 0;
        while (i < j) {
            ans += (long)Math.pow(nums[j], 2) - (long)Math.pow(nums[i], 2);
            i++;
            j--;
        }
        if (i == j) {
            ans += (long) Math.pow(nums[i], 2);
        }
        return ans;
    }
}