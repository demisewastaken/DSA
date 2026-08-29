import java.util.HashSet;
class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            set.add(word.charAt(i));
        }

        char char1 = 'a';
        char char2 = 'A';
        int count = 0;
        while (char1 <= 'z') {
            if (set.contains(char1) && set.contains(char2)) {
                count++;
            }
            char1++;
            char2++;
        }
        return count;
    }
}