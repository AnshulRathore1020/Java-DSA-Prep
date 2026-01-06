public class SecondLargest {
    public static void main(String[] args) {
        int[] nums={10,20,30,50,50};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > first){
                second=first;
                first=nums[i];

            }
            else if(nums[i] > second && nums[i] != first){
                second=nums[i];
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("there no Second largest element ");
        }
        else{
              System.out.println("First Largest Element :"+first);
        System.out.println("Second Largest Element :"+second);
        }
      

       
    }
}
