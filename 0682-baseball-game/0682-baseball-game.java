import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "+":
                    int second = stack.pop();
                    int first = stack.pop();
                    stack.push(first);
                    stack.push(second);
                    stack.push(first + second);
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum = sum + stack.pop();
        }

        return sum;


    }
}