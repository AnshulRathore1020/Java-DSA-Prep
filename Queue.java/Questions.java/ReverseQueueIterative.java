//Reverse Queue with stack

import java.util.*;

public class ReverseQueueIterative {

    public static void reverse(Queue<Integer>q){
        Stack<Integer> stack=new Stack<>();
        while(!q.isEmpty()){
            stack.push(q.remove());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        reverse(q);
        System.out.println(q);

    }
}

