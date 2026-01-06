//Find the maximum & minimum number in an array of integers. 
import java.util.Scanner;

public class minimumandmaximum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int []minimum = new int[size];

    //input

    for (int i = 0; i < size; i++) {
        minimum[i]=sc.nextInt();
    }

  int max=Integer.MIN_VALUE;
  int min=Integer.MAX_VALUE;

  for (int i = 0; i < minimum.length; i++) {
      if(minimum[i]<min){
        min = minimum[i];
      }
      if(minimum[i]>max){
        max=minimum[i];
      }
  }
  System.out.println("largest number is "+ max);
System.out.println("minimum number is  "+min);
    }
}
