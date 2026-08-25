import java.util.HashMap;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i] , 1);
        }

        int key = k;

        for (int i = 1; i <= nums.length; i++) {
            if (map.getOrDefault(key, -1) == -1) {
                return key;
            }
            key = key + k;
        }

        return key;
    }
}