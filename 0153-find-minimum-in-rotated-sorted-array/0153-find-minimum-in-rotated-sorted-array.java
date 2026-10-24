class Solution {
    public int findMin(int[] nums) {
        int findPivot = pivot(nums);

        if (findPivot == -1) {
            return nums[0];
        }

        return nums[findPivot + 1];
    }

    // Find the index of the largest element before the rotation
    static int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (nums[mid] < nums[0]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
