//rotate array form k value


public class RotateArray {
        public static void main(String[] args) {
            int[] nums={10,20,30,40,50};
            int k=2;
            int n=nums.length;

            int[] result=new int[n];
            for (int i = 0; i < n; i++) {
                int newindex=(i+k)%n;
                result[newindex]=nums[i];

            }
            for(int x:result){
                System.out.print(x+" ");
            }
        }

}
