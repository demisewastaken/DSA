import java.util.Stack;
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            if (temp == '(') {
                stack.push(temp);
            }else {
                if (stack.isEmpty()) {
                    count++;
                }else {
                    stack.pop();
                }
            }
        }
        count += stack.size();
        return count;
    }
}