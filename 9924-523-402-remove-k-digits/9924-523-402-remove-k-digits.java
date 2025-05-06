import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            
            // Remove digits from the stack if they are greater than the current digit
            while (!stack.isEmpty() && k > 0 && stack.peek() >ch) {
                stack.pop();
                k--;
            }

            stack.push(ch);
        }

        // If there are still digits to remove
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Build the final result
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);  // ✅ fixed typo: deletecharAt -> deleteCharAt
        }

        // Return result or "0" if empty
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
