
import java.util.Scanner;


public class PairWithGivenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        int start=0;
        int end=arr.length-1;

        while(start < end){
            int sum=arr[start] + arr[end];
            if(sum == target){
                System.out.println("yes");
                return;
            }else if(sum < target){
                start++;
            }else{
                end--;
            }
            
        }
        System.out.println("No");
        sc.close();
    }
}
