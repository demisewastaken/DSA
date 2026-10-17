import java.util.HashMap;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char temp = s1.charAt(i);
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char temp = s2.charAt(i);
            map2.put(temp, map2.getOrDefault(temp, 0) + 1);
        }
        if (map.equals(map2)) {
            return true;
        }
        int j = 0;
        for (int i = s1.length(); i < s2.length(); i++) {
            map2.put(s2.charAt(j), map2.get(s2.charAt(j)) - 1);
            if (map2.getOrDefault(s2.charAt(j), 0) == 0) {
                map2.remove(s2.charAt(j));
            }
            char temp = s2.charAt(i);
            map2.put(temp, map2.getOrDefault(temp, 0) + 1);
            if (map.equals(map2)) {
                return true;
            }
            j++;
        }
        return false;
    }
}