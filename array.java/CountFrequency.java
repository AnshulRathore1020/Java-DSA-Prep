
import java.util.HashMap;

public class CountFrequency {
   public static void main(String[] args) {
    
    int num[]={1,1,1,2,2,2,3,4,4,5};
    HashMap<Integer, Integer> freq=new HashMap<>();

     for (int numss: num) {
            freq.put(numss, freq.getOrDefault(numss, 0) + 1);
        }

        for (int key : freq.keySet()) {
            System.out.println(key + " occurs " + freq.get(key) + " times");
        }
   }
} 



