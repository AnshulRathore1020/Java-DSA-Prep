import java.util.*;

public class ImplementStackUsingTwoQueue {

    Queue<Integer> q=new LinkedList<>();
    Queue<Integer> q1=new LinkedList<>();

    public void push(int data){
        q1.add(data);

        while(!q.isEmpty()){
            q1.add(q.remove());
        }

        Queue<Integer> temp=q;
        q=q1;
        q1=temp;
    }

    public int pop(){
        if(q.isEmpty()){
            System.out.println("Stack is empty");
        }
        return q.remove();
    }
    public int top(){
        if(q.isEmpty()){
            System.out.println("stack is empty");
        }
        return q.peek();
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }
    


    public static void main(String[] args) {

          ImplementStackUsingTwoQueue st = new ImplementStackUsingTwoQueue();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top element: " + st.top()); // 30
        System.out.println("Pop: " + st.pop());         // 30
        System.out.println("Top element: " + st.top()); // 20
        
    }
}
