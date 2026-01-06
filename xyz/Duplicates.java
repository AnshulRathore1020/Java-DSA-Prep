
import java.util.Stack;

public class Duplicates {
    public static boolean duplicatedparentheses(String str){

        Stack<Character> stack=new Stack<>();

        for(char ch:str.toCharArray()){
            if(ch == ')'){
                int count=0;
             while(!stack.isEmpty() && stack.peek() != '('){
                stack.pop();
                count++;
            }
            if(!stack.isEmpty()) stack.pop();

            if(count == 0){
                return true;
            }
            }else{
                stack.push(ch);
            }

            }
          return false;
        }
        public static void main(String[] args) {
        System.out.println(duplicatedparentheses("((a+b))"));     // true
        System.out.println(duplicatedparentheses("(a+(b)/c)"));   // false
        System.out.println(duplicatedparentheses("((a))"));       // true
        System.out.println(duplicatedparentheses("(a+b)"));       // false
        }
        
    }

