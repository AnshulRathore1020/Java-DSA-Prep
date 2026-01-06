public class MinimumValue {
    public static void main(String[] args) {
      int arr[]={10,30,20,50,22};
      int min=Integer.MAX_VALUE;
      for (int i = 0; i < arr.length; i++) {
          if(arr[i] < min){
            min=arr[i];
          }
      }
      System.out.println(min);

    }
}
