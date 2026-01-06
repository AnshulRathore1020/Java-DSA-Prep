import java.util.Stack;
public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minstack;

    public MinStack(){
        stack=new Stack<>();
        minstack=new Stack<>();
    }

    public void push(int val){
        stack.push(val);
        if(minstack.isEmpty() || val <= minstack.peek()){
            minstack.push(val);
        }
    }

    public void pop(){
        if(stack.isEmpty()){
            return;
        }
        int removed=stack.pop();
        if(removed == minstack.peek()){
            minstack.pop();
        }
    }
    public int top(){
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek();
    }
    public int getmin(){
        if(minstack.isEmpty()){
            return -1;
        }
        return minstack.peek();
    }
    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Min: " + minStack.getmin());   // -3
        minStack.pop();
        System.out.println("Top: " + minStack.top());      // 0
        System.out.println("Min: " + minStack.getmin());   // -2
    }
    }

