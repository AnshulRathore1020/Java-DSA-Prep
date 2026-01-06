
import java.util.ArrayList;
import java.util.Arrays;

public class RemovexFromList {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>(Arrays.asList(1,2,2,2,3,4,5,6));
        int x =2;
        ArrayList<Integer> result = new ArrayList<>();

        for(int num : List){
            if(num != x){
                result.add(num);
            }

        }
     System.out.println("Original List: " + List);
        System.out.println("After removing " + x + ": " + result);

    }
}
