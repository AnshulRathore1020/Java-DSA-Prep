
import java.util.HashMap;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,4,2,5,6,3};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num, 0)+1);

        }
        for(int ans:map.keySet()){
            if(map.get(ans) > 1){
                System.out.println(ans);
            }
        }
    }
}
