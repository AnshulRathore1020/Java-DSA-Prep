import java.util.ArrayList;
import java.util.Arrays;

public class MergedTwoList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6));

        ArrayList<Integer> Mergedtwolist = new ArrayList<>(list1);
        Mergedtwolist.addAll(list2);
        System.out.println(Mergedtwolist);
    }
}
