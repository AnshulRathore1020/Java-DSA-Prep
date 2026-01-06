import java.util.Stack;

public class DuplicatedBrackets {
    public static boolean hasDuplicateBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == ')') {
                int count = 0;

                // pop till opening bracket
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count++;
                }

                // remove opening bracket '('
                if (!stack.isEmpty()) {
                    stack.pop();
                }

                // if nothing inside ()
                if (count == 0) {
                    return true; // duplicate found
                }
            } else {
                stack.push(ch);
            }
        }
        return false; // no duplicate
    }

    public static void main(String[] args) {
        System.out.println("((a+b)) -> " + hasDuplicateBrackets("((a+b))"));     // true
        System.out.println("(a+(b)/c) -> " + hasDuplicateBrackets("(a+(b)/c)")); // false
        System.out.println("(a+((b+c)))) -> " + hasDuplicateBrackets("(a+((b+c))))")); // true
    }
}
