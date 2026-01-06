//sum and average of an array 
public class sumoraverage {
 public static void main(String[] args) {
    int arr[]={10,20,30,40,50};
    int sum=0;
    

    for(int i=0;i<arr.length;i++){
        sum += arr[i];
    }
    int average=sum / arr.length;

    System.out.println("sum" + sum);
    System.out.println("average"+average);

 }   
}
