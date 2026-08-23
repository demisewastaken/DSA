class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        char[] stack = new char[s.length()];
        int stackPointer = -1;

        for (int i = 0; i < s.length(); i++) {
            char next = s.charAt(i);

            if (next == ')' || next == '}' || next == ']') {
                if (stackPointer < 0) {
                    return false;
                }

                switch (next) {
                    case ')':
                        if (stack[stackPointer] != '(') {
                            return false;
                        }
                        stackPointer--;
                        break;

                    case '}':
                        if (stack[stackPointer] != '{') {
                            return false;
                        }
                        stackPointer--;
                        break;

                    case ']':
                        if (stack[stackPointer] != '[') {
                            return false;
                        }
                        stackPointer--;
                        break;
                }

            } else {
                stackPointer++;
                stack[stackPointer] = next;
            }
        }

        return stackPointer == -1;
    }
}