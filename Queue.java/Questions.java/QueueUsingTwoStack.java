import java.util.Stack;
public class QueueUsingTwoStack {
   Stack<Integer> stack1=new Stack<>();
   Stack<Integer> stack2=new Stack<>();

   public void enqueue(int data){
    stack1.push(data);
   }
   public int dequeue(){
    if(stack2.isEmpty()){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    if(stack2.isEmpty()){return -1;}
    return stack2.pop();
   }

   public int peek(){
    if(stack2.isEmpty()){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    if(stack2.isEmpty()){
        return -1;
    }
    return stack2.peek();
    
   }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }


}
