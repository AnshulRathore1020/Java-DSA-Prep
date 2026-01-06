// Find the second largest or third largest element of the array and this is the optimized code for this problem

public class ThirdLargest {
    public static void main(String[] args) {
    int arr[]={10,3,50,40,50,20,70,80};
    int first=Integer.MIN_VALUE;
    int Second=Integer.MIN_VALUE;
    int Third=Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
       if(arr[i] > first){
        Third=Second;
        Second=first;
        first=arr[i];
       }else if(arr[i] > Second && arr[i] != first){
        Third=Second;
        Second=arr[i];
       }
       else if(arr[i] > Third && arr[i] != Second){
        Third=arr[i];
       }
    }
    System.out.println("largest element of array :"+first);
    System.out.println("Second largest element of array :"+Second);
    System.out.println("Third largest element of array :"+Third);

}
}