import java.util.ArrayList;
import java.util.Arrays;

public class CheckPalindrome {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,2,1));

        boolean ispalin = true;
        int i = 0;
        int j = list.size() -1;

        while(i < j){
            if(!list.get(i).equals(list.get(j))){
                ispalin = false;
                break;

            }
            i++;
            j--;
        }
        System.out.println("Is palindrome "+ ispalin);

    }
}
