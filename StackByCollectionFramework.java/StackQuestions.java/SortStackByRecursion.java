import java.util.Stack;

public class SortStackByRecursion {
    public static void insertsortelement(Stack<Integer> stack,int element){
        if(stack.isEmpty() || element > stack.peek()){
            stack.push(element);
            return ;

        }
        int top = stack.pop();
        insertsortelement(stack, element);
        stack.push(top);
        
    }
        public static void sortStack( Stack<Integer> stack){
            if(stack.isEmpty()){
                return ;
            }
            int top=stack.pop();
            sortStack(stack);
            insertsortelement(stack, top);
        }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(7);
        System.out.println("original stack :"+stack);
        sortStack(stack);
        System.out.println("after sorting : "+stack);
    }
}
