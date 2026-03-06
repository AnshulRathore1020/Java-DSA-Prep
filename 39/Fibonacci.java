import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int first=0;
        int second=1;

        for (int i = 0; i < num; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first=second;
            second=next;
            
        }

    }
}
