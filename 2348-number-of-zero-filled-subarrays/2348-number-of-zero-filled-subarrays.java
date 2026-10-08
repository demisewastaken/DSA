class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                long count = 0;
                do {
                    count++;
                    i++;
                }while (i < n && nums[i] == 0);
                ans += (count * (count + 1)) / 2;
                count = 0;
            }
        }
        return ans;
    }
}