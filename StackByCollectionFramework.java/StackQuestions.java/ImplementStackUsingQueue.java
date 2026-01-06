import java.util.*;

 class ImplementStackUsingQueue {

    Queue<Integer> q = new LinkedList<>();

    public  void push(int x){
        
        int size = q.size();
        q.add(x);

        for(int i=0;i<size; i++){
            q.add(q.remove());
        }


    }
    public int pop(){
        if(q.isEmpty()){
            System.out.println("quque is empty");
            return -1;
        }
        return q.remove();
    }

    public int top(){
        if(q.isEmpty()){
            System.out.println("quque is empty");
            return -1;
        }
        return q.peek();
    }

    public static void main(String[] args) {
        
        ImplementStackUsingQueue s = new ImplementStackUsingQueue();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top Element "+ s.top());
        System.out.println("popped element "+s.pop());
        System.out.println("Top element " + s.top());
        
    }
}
