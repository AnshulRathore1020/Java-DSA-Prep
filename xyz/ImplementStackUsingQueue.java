import java.util.*;

public class ImplementStackUsingQueue {
    Queue<Integer> q=new LinkedList<>();

    public void push(int x){
         q.add(x);
        int size=q.size();
       
        
        for(int i=0;i<size -1;i++){
            q.add(q.remove());
        }
    }

    public int pop(){
        if(q.isEmpty()){
            System.out.println("stack is empty");
            return -1;

        }
        int top=q.remove();
        return top;
    }

    public int peek(){
           if(q.isEmpty()){
            System.out.println("stack is empty");
            return -1;

        }
        return q.peek();
    }
    public static void main(String[] args) {
        ImplementStackUsingQueue is=new ImplementStackUsingQueue();
        is.push(10);
        is.push(20);
        is.push(30);
        is.push(40);
        System.out.println("top of the staack is :"+is.peek());
        System.out.println("remove element is :"+is.pop());
        

        
    }

}
