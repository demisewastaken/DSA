import java.util.HashMap;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        int count = 0;
        for (int j = 0; j < prefixSum.length; j++) {
            if (prefixSum[j] == k) {
                count++;
            }

            int val = prefixSum[j] - k;
            int freq = map.getOrDefault(val, 0);
            count = count + freq;

            if (map.get(prefixSum[j]) != null) {
                freq = map.get(prefixSum[j]);
                map.put(prefixSum[j], freq + 1);
            }else {
                map.put(prefixSum[j], 1);
            }
        }
        return count;
    }
}