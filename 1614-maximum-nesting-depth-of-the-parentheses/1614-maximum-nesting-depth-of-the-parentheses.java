import java.util.Stack;
class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(') {
                stack.push(temp);
            }else if (temp == ')') {
                max = Math.max(max, stack.size());
                stack.pop();
            }
        }
        return max;
    }
}