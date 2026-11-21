class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] array = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (array[nums[i]] != 0) {
                list.add(nums[i]);
            }else {
                array[nums[i]] = nums[i];
            }
        }
        return list;
    }
}