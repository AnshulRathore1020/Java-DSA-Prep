
import java.util.ArrayList;
import java.util.Arrays;

public class CountFrequency {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,2,3,3,3,4,4));
        ArrayList<Integer> uniqueelement = new ArrayList<>();
        
        for(int num : original)
        {
            if(!uniqueelement.contains(num)){
                uniqueelement.add(num);
            }
        }

        for(int uniquenum : uniqueelement){
            int count = 0;
            for(int num :original){
                if(num == uniquenum){
                    count++;
                }
            }
                System.out.println(uniquenum + " : " +count);
        }
    
    }
}
