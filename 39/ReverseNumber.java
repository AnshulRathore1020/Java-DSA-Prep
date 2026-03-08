import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int rev = 0;
        while (num != 0) {
            int next = num % 10;       // last digit
            rev = rev * 10 + next;     // build reverse
            num = num / 10;            // remove last digit
        }

        System.out.println(rev);       // print reversed number
    }
}