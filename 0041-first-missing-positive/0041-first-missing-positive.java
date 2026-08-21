class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] >= 1 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                int index = nums[i];
                int temp = nums[index - 1];
                nums[index - 1] = index;
                nums[i] = temp;
            }
        }

        int target = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            }
            if (nums[i] == target) {
                target++;
            }else {
                return target;
            }
        }
        return target;  
    }
}