class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Long, Integer> map = new HashMap<>();

        long sum = nums[0];
        map.put(sum % k, 0);

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            long rem = sum % k;
            if (rem == 0) return true;
            int found = map.getOrDefault(rem, -1);
            if (found == -1) {
                map.put(rem, i);
            }else {
                if (i - found > 1) {
                    return true;
                }
            }
        }
        return false;
    }
}