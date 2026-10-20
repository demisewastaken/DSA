class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }
        paragraph = paragraph.trim();
        for (int i = 0; i < paragraph.length(); i++) {
            StringBuilder temp = new StringBuilder();
            int j = i;
            if (!Character.isLetter(paragraph.charAt(i))) continue;
            do {
                temp.append(paragraph.charAt(j));
                j++;
            }while (j < paragraph.length() && Character.isLetter(paragraph.charAt(j)));

            String word = temp.toString().toLowerCase();
            if (word.length() == 1 && !Character.isLetter(word.charAt(0))) continue;
            if (!set.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            i = j;
        }
        String ans = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                ans = word;
            }
        }

        return ans;
    }
}