class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int min = Integer.MAX_VALUE;
        boolean found = false;
        for (int i = 1; i < n; i++) {
            nums.set(i, nums.get(i) + nums.get(i - 1));
        }

        int prevSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + l - 1; j < n && j <= i + r - 1; j++) {
                int sum = nums.get(j) - prevSum;
                if (sum > 0) {
                    found = true;
                    min = Math.min(min, sum);
                }
            }
            prevSum = nums.get(i);
        }
        if (!found) return -1;
        return min;

        
    }
}