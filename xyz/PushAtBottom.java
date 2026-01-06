
import java.util.*;
public class PushAtBottom {
    public static void push(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
       int top= s.pop();
        push(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer>s){
        if(s.isEmpty()){
           return;
        }
        int top=s.pop();
        reverse( s);
        push(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(10);
        s.add(20);
        s.add(30);

    //    push(4, s);

    //    while(!s.isEmpty()){
    //     System.out.println(s.peek());
    //     s.pop();

    reverse(s);
    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }


       }
    }

