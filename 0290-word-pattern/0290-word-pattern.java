import java.util.HashMap;
import java.util.HashSet;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        String[] array = s.split(" ");
        if (pattern.length() != array.length) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (map.get(pattern.charAt(i)) == null) {
                if (set.contains(array[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), array[i]);
                set.add(array[i]);
            }else {
                if (map.get(pattern.charAt(i)).equals(array[i])) {
                    continue;
                }else {
                    return false;
                }
            }
        }
        return true;

    }
}