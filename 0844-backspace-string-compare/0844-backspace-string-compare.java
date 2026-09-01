import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp != '#') {
                stack1.push(temp);
            }else {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char temp = t.charAt(i);
            if (temp != '#') {
                stack2.push(temp);
            }else {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            }
        }

        if (stack1.size() != stack2.size()) {
            return false;
        }else {
            while (!stack1.isEmpty()) {
                if (stack1.pop() != stack2.pop()) {
                    return false;
                }
            }
            return true;
        }
    }
}