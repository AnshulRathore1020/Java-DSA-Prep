import java.util.*;

public class InterleaveFirst {
    public static void interleave(Queue<Integer> q){

         if (q.size() % 2 != 0) {
            System.out.println("Queue must have even number of elements");
            return;
        }
        int n = q.size();

        Queue<Integer> z=new LinkedList<>();
        for (int i = 0; i < n /2; i++) {
            z.add(q.remove());
        }
        while(!z.isEmpty()){
            q.add(z.remove());
            q.add(q.remove());
        }
      

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        System.out.println("original Queue :"  + q);
        interleave(q);
        System.out.println("After iterate:"  + q);
    }

}
