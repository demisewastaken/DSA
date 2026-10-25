
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] array = Arrays.copyOf(score, score.length);
        Arrays.sort(array);
        HashMap<Integer, String> map = new HashMap<>();
        int count = 1;
        for (int i = score.length - 1; i>=0; i--) {
            switch (count) {
                case 1: map.put(array[i], "Gold Medal"); break;
                case 2: map.put(array[i], "Silver Medal"); break;
                case 3: map.put(array[i], "Bronze Medal"); break;
                default: map.put(array[i], count+""); break;
            }
            count++;
        }

        String[] ans = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            ans[i] = map.get(score[i]);
        }

        return ans;

        
    }
}