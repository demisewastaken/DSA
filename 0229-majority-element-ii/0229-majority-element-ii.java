import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int boundary = nums.length / 3;

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                if (boundary == 0) {
                    list.add(nums[i]);
                }
                map.put(nums[i], 1);
            }else {
                if (map.get(nums[i]) > boundary) {
                    continue;
                }
                if (map.get(nums[i]) + 1 > boundary) {
                    list.add(nums[i]);
                }
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        return list;
    }
}