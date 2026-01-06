import java.util.ArrayList;
import java.util.Collections;

public class ListDefine {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
      
      //add element 
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

      //Get element
      int element =  list.get(2);
      System.out.println(element);

      //ADD EL IN BETWEEN
      list.add(2, 3); 
      System.out.println(list);

      //Get
      list.set(3, 5);
      System.out.println(list);

      //remove matlab list se kisiko hatana
      list.remove(3);
      System.out.println(list);

      //size
      int size = list.size();
      System.out.println(size);

      //loops
      for (int i = 0; i < list.size(); i++) {
          System.out.print(list.get(i) +"  ");
      }

      //sorting
      Collections.sort(list);
      System.out.println(list);


    }


}
