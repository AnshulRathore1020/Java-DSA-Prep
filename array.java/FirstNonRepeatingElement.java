
import java.util.HashMap;

public class FirstNonRepeatingElement {


    public static void main(String[] args) {
        int[] nums={1,2,1,2,1,2,1,2,3,1,2,5};
        HashMap<Integer,Integer> p=new HashMap<>();
        for(int num:nums){
            p.put(num, p.getOrDefault(num,0)+1);
        }
        for(int ans:nums){
            if(p.get(ans) == 1){
                System.out.println(ans);
                return;
            }
        }
        System.out.println("there is no non-repeating element in this array");
    }
}
