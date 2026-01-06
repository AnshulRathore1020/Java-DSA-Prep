
import java.util.HashMap;





public class TwoSum {


// This is Brute force approach is O(n²)”

    // public static void main(String[] args) {
    //     int[] nums = {2, 7, 11, 15};
    //     int target=9;

    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i+1; j < nums.length; j++) {
    //             if(nums[i] + nums[j] == target){
    //                 System.out.println(i + " " + j);
    //             }
    //         }
    //     }
    // }

    // “Use HashMap to store previous elements and check complement” 

    public static void main(String[] args) {
        
        int[] nums={2,7,11,15};
        int target=9;

        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need=target-nums[i];
            if(map.containsKey(need)){
                System.out.println(map.get(need)+" "+i);
                break;
            }
            map.put(nums[i], i);
        }


    }

}
