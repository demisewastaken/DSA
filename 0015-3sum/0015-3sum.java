import java.util.Arrays;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                }else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                }else {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j - 1] == nums[j]) {
                        j++;
                    } 
                }
            }
        }
        return list;
    }
}