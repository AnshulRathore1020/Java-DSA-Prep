//Take an array of numbers as input and check if it is an array sorted in ascending order.

public class ascending {
    public static void main(String[] args) {
      
        int[] nums={10,20,30,40,50};
        boolean ascending=true;

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1]){
                ascending=false;
                break;
            }
        }
        if(ascending){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
