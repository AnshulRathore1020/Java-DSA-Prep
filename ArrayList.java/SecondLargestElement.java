import java.util.ArrayList;
import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,40,25));

        if(list.size() < 2){
            System.out.println("list is less than two numbers");
        }
        int max = Integer.MIN_VALUE;
        int Secondmax = Integer.MIN_VALUE;

        for(int num : list){
            if(num > max){
                Secondmax = max;
                max = num;

            }
            else if(num > Secondmax && num != max){
                Secondmax = num;

            }

            
        }
        if(Secondmax == Integer.MIN_VALUE){
            System.out.println("No second largest elemnt (all emement might be same )");
        }
        else{
            System.out.println("largest element : "+ max);

            System.out.println("Second largest element is :" + Secondmax);
        }
    }
}
