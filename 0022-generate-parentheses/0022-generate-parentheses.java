import java.util.ArrayList;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        makeParenthesis(list, "", 0, 0, n);
        return list;
    }

    public void makeParenthesis(List<String> list, String current, int open, int close, int n) {
        if (current.length() == 2*n) {
            list.add(current);
            return;
        }

        if (open < n) {
            makeParenthesis(list, current + "(", open + 1, close, n);
        }

        if (close < open) {
            makeParenthesis(list, current + ")", open, close + 1, n);
        }
    }
}