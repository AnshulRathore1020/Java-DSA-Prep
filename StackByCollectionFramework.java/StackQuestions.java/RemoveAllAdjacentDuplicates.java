import java.util.Stack;

public class RemoveAllAdjacentDuplicates {
    // is question ka matlab hai ki "azxxzy" diya hai to phele stack me 
    // a jayega check karega stack empty hai to fir push hoo jayega //
    //fir z jayega stack me nhi hai push hoo jayega 
    //fir x jayega stack me nhi hai push hoo jayega 
    //fir x dekhega is stack khali nhi hai or stack me x phele se hai to pop hoo jayega
    //fir z dekhge is stack khali nhi hai or stack me z phele se hai to pop hoo jayega
    //fir y jayega or dekhega phele se hai to nhi ager nhi hai to push hoo jayega 
    // at the end anser aayega [a,y]
    public static String Removeall(String s){

        Stack<Character> stack = new Stack<>();

        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }else{
            stack.push(ch);
            }
        }
        //stack ke  character ko string me convert karna hai 

        StringBuilder result =new StringBuilder();
        for(char ch:stack){
            result.append(ch);

        }
        return result.toString();

    }
    public static void main(String[] args) {
        String s="azxxzy";
        System.out.println("result :" + Removeall(s));
    }
}
