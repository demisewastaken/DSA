import java.util.*;

class Solution {
    String[][] map = {
        {"a","b","c"},
        {"d","e","f"},
        {"g","h","i"},
        {"j","k","l"},
        {"m","n","o"},
        {"p","q","r","s"},
        {"t","u","v"},
        {"w","x","y","z"}
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;
        backtrack(digits, 0, "", result);
        return result;
    }

    private void backtrack(String digits, int index, String path, List<String> result) {
        if (index == digits.length()) {
            result.add(path);
            return;
        }

        String[] letters = map[digits.charAt(index) - '2'];
        for (String letter : letters) {
            backtrack(digits, index + 1, path + letter, result);
        }
    }
}