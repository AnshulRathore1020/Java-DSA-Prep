import java.util.Stack;
public class ValidParentheses {
    public static boolean isvalid(String str){
        Stack<Character> stack = new Stack<>();

        for(char ch:str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else {
                if(stack.isEmpty()) 
                return false;

                char top =stack.pop();
                if((ch == ')' &&  top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                    return false; // mismatched pair
                }
            }
           
                
            }
        
            return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isvalid("({[]})"));
        System.out.println(isvalid("()[}]"));
    }
}
