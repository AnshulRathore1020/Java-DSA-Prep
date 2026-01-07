

public class RangeSumQuery {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int n=nums.length;

        int[] prefix=new int[n];
        prefix[0]=nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i]=prefix[i-1] + nums[i];
        }

    int L1 = 1, R1 = 3; // query 1
        int sum1 = prefix[R1] - prefix[L1 - 1];
        System.out.println("Sum(1,3) = " + sum1);

        
        int L2 = 2, R2 = 5; // query 2
        int sum2=prefix[R2] - prefix[L2 -1];
        System.out.println("Sum(2,5) = "+sum2);




        



       
    }
}
