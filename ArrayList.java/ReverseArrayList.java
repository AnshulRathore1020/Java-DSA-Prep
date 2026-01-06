import java.util.*;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>(Arrays.asList(10,20,30,40));
        // ArrayList<Integer> ReverseList = new ArrayList<>();

        // for (int i = original.size() -1; i >= 0; i--) 
        // {
        //     ReverseList.add(original.get(i));
        // }
        // System.out.println("Original List :" + original);
        // System.out.println("Reverse List :" + ReverseList);

        //ye advanced shortcut hai arraylist ko reverse karne ka 
        Collections.reverse(original);
        System.out.println(original);
    }
}
