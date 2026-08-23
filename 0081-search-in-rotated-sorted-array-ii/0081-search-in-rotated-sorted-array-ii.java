class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            }
            //if start, mid, and end have duplicates, just skip them
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                start++;
                end--;
            }

            //Search Left half
            else if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && nums[mid] > target) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
            //Search Right Half
            else{
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return false;
    }    
}