import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            int freq = map.getOrDefault(num, 0);

            if (freq == 0) {
                list.add(num);
            }

            map.put(num, freq + 1);
        }

        // Sort numbers by frequency, highest first
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
