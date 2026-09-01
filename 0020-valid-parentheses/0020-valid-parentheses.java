import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[') {
                stack.push(temp);
            }else {
                if (stack.isEmpty()) {
                    return false;
                }
                char popped = stack.pop();
                if ((temp == ')' && popped == '(')
                    || (temp == '}' && popped == '{')
                    || (temp == ']' && popped == '[')) {
                    continue;
                }else {
                    return false;
                }
            }
        }

        return (stack.isEmpty());
    }
}