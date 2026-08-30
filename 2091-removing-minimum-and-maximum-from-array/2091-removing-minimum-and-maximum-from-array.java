class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex = 0;
        int maxIndex = 0;
        int min = nums[0];
        int max = nums[0];
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }

        int front = Math.max(minIndex, maxIndex) + 1;
        int back = n - Math.min(minIndex, maxIndex);

        int minAns = Math.min(front, back);

        int frontBack = (Math.min(minIndex, maxIndex) + 1)  + (n - Math.max(minIndex, maxIndex)); 

        return Math.min(minAns, frontBack);


    }
}