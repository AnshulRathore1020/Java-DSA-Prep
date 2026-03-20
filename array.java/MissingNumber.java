import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // total numbers

        int[] nums = new int[n - 1];  // one number missing

        for (int i = 0; i < n - 1; i++) {
            nums[i] = sc.nextInt();
        }

        int totalSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        System.out.println("Missing number is: " + (totalSum - actualSum));

        sc.close();
    }
}