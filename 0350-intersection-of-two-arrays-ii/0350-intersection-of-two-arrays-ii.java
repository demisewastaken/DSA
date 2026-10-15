import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < nums2.length; i++) {
            int count = 1;
            int j;
            for (j = i + 1; j < nums2.length; j++) {
                if (nums2[j] == nums2[i]) {
                    count++;
                }else {
                    break;
                }
            }
            int available = map.getOrDefault(nums2[i], 0);
            if (count >= available) {
                for (int k = 0; k < available; k++) {
                    list.add(nums2[i]);
                }
            }else {
                for (int k = 0; k < count; k++) {
                    list.add(nums2[i]);
                }
            }
            i = j - 1;
        }
        int size = list.size();
        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}