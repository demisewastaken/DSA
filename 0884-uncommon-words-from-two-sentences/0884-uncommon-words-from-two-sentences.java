class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s1 + " " + s2);
        String[] array = sb.toString().split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == 1) {
                list.add(array[i]);
            }
        }

        String[] ans = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;


    }
}