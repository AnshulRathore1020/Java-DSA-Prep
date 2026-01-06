import java.util.*;

public class BalancedParentheses {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // Opening brackets push
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Closing brackets check
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false; // extra closing

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // mismatch
                }
            }
        }
        // End me stack empty hona chahiye
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("({[]})"));   // true
        System.out.println(isBalanced("({[})"));    // false
        System.out.println(isBalanced("((())"));    // false
    }
}
