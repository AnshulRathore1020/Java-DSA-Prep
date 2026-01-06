
import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,5,6,7,8,4));

        ArrayList<Integer> Intersection = new ArrayList<>();
        for(int num : list1){
            if(list2.contains(num) && !Intersection.contains(num)){
                Intersection.add(num);
            }
        }
        System.out.println("Intersection of two list is : " + Intersection);
     }
}
//ek or esa question bhi aa skta hai ki find common elements in two arraylists 
// to bhi yhi karna hai same hi hai dono