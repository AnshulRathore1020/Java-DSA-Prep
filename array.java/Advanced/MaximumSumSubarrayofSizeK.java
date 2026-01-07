

public class MaximumSumSubarrayofSizeK {
   
    public static void main(String[] args) {
         int[] nums={2,1,5,1,3,2};
    int k=3;

    int windowsum=0;
    
    for(int i=0 ;i<k;i++){
        windowsum += nums[i];

    }
    int maxwindow=windowsum;

    for (int i = k; i < nums.length; i++) {
        windowsum += nums[i];
        windowsum -= nums[i -k];
         maxwindow=Math.max(maxwindow, windowsum);
    }

    System.out.println(maxwindow);
    }

    
}
