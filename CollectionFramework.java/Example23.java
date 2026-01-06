import java.util.*;
public class Example23 {
    public static void main(String[] args) {
        ArrayList<Integer> o1 = new ArrayList<>();
        o1.add(2);
        o1.add(3);
        o1.add(4);
        o1.add(5);
        o1.add(6);
        o1.add(7);
        System.out.println(o1);
        
        HashSet<Integer> list = new HashSet<>();
        list.add(1);
        list.add(2);
        System.out.println(list);

        PriorityQueue<Integer> system =new PriorityQueue<>();
        system.add(10);
        system.add(20);
        system.add(300);
        System.out.println(system);
     
    }
}
