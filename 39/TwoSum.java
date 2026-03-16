
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter element of array");
        
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target of array");
        int target=sc.nextInt();

        HashMap<Integer,Integer> map=new HashMap<>();
       
        for(int i=0;i<arr.length;i++){

             int need=target-arr[i];
            if(map.containsKey(need)){
                System.out.println(need +" "+ arr[i]);
                return;
            }
            map.put(arr[i], i);
        }
        sc.close();
    }
}
