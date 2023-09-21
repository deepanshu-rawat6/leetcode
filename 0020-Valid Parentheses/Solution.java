// Approach One: Using Stacks

/*
 * First, eliminating those string with odd length.
 * Using stack to store the charcters from the arrays, and then comparing the top to the incoming characters.
 * If we found the match, then we pop the top element from the stack
 * Otherwise we add the incoming character to the stack
 * Iterating the length, and if in the end our stack is not empty then we can say the given string is not a valid parentheses
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 != 0) {
            return false;
        }

        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.add(ch);
            } else {
                if (stack.peek() == '(' && ch == ')') {
                    stack.pop();
                } else if (stack.peek() == '[' && ch == ']') {
                    stack.pop();
                } else if (stack.peek() == '{' && ch == '}') {
                    stack.pop();
                } else {
                    stack.add(ch);
                }
            }
        }

        return stack.isEmpty();
    }
}
