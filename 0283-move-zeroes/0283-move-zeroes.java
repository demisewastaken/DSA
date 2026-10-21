class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        boolean changeIndex = false;
        for (int i = 0; i < nums.length; i++) {
            if (!changeIndex && nums[i] != 0) continue;

            if (!changeIndex && nums[i] == 0) {
                changeIndex = true;
                zeroIndex = i;
            }else {
                if (nums[i] != 0) {
                    nums[zeroIndex] = nums[i];
                    zeroIndex++;
                }
            }
        }
        if (!changeIndex) return;
        for (int i = zeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}