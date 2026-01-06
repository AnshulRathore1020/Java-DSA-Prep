import java.util.*;
public class ReverselinkedlistUsingCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("original list :- "+list);

        //here we use a property of collections 
        Collections.reverse(list);
        System.out.println("after reverse list :- "+ list);
    }
}
