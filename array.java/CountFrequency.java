
import java.util.*;
public class CountFrequency {
   public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();
    }
    LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
    for(int nums:arr){
        map.put(nums, map.getOrDefault(nums, 0)+1);
    }
    for(int key:map.keySet()){
       System.out.println(key + " -> " + map.get(key));

    }
    sc.close();

   }
} 



