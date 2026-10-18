import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            set.add(nums[i]);
            if (set.size() > list.size()) {
                list.add(nums[i]);
            }
        }

        int max = 0;
        if (list.size() == 1) {
            return 0;
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) == 1) {
                max = Math.max(max, map.get(list.get(i)) + map.get(list.get(i - 1)));
            }
        }
        return max;
    }
}