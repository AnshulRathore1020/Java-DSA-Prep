//reverse first k element of a queue
import java.util.*;
public class KReverse {
    public static void reversek(Queue<Integer>q,int k){
        if(q.isEmpty() || k > q.size() || k < 0){
            System.out.println("Invalid k");
            return ;
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<k;i++){
            stack.push(q.remove());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        int size=q.size();
        for (int i = 0; i < size - k ; i++) {
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println("original queque "+q);
        reversek(q, 3);
        System.out.println("After reverse k element "+q);
        

    }

}
