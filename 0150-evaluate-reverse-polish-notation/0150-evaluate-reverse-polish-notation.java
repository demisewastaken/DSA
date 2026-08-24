import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            try {
                int num = Integer.parseInt(s);
                stack.push(num);
            }catch (NumberFormatException e) {
                int num1 = stack.pop();
                int num2 = stack.pop();

                switch (s) {
                    case "+" : stack.push(num2 + num1); break;
                    case "-" : stack.push(num2 - num1); break;
                    case "*" : stack.push(num2 * num1); break;
                    case "/" : stack.push(num2 / num1); break;
                }
            }
        }
        return stack.pop();
    }
}