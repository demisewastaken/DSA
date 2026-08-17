class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            int min = findMin(nums, i);
            int diff = max - min;
            if (max - min <= k) {
                return i;
            }
        }
        return -1;
    }

    public int findMin(int[] array, int start) {
        int min = array[start];

        for (int i = start; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }

        return min;
    }
}