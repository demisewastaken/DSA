class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (map1.getOrDefault(t.charAt(i), 0) < map2.get(t.charAt(i))) return t.charAt(i);
        }
        return 'a';
    }
}