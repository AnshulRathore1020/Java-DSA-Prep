import java.util.Stack;
public class ReverseStack {

    public static void BottomAdd(int data, Stack<Integer> s){

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        BottomAdd(data, s);
        s.push(top);
    }

    public static void reverse( Stack<Integer> s){
        if(s.isEmpty()){
            return ;
        }
        int top = s.pop();
        reverse(s);
        BottomAdd(top, s);
        
    }

    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("original Stack : "+s);
        reverse(s);
        System.out.println("Reversed Stack : "+s);


    }
}
