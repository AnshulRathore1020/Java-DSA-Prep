
import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {
    //     int[] marks = new int[5];
    //     marks[0]=80;
    //     marks[1]=90;
    //     marks[2]=60;
    //     marks[3]=50;
    //     marks[4]=40;

    // //  //   System.out.println(marks[0]);
    // //     System.out.println(marks[1]);
    // //     System.out.println(marks[2]);
    // //     System.out.println(marks[3]);
    // //     System.out.println(marks[4]);//

    // for (int i = 0; i < 3; i++) {
    //     System.out.println(marks[i]);
    // }
        
    Scanner sc = new Scanner(System.in);
    int size=sc.nextInt();

    int[] number = new int[size];

//input
        for (int i = 0; i < size; i++) {
            number[i]=sc.nextInt();
        }
        
        int x=sc.nextInt();
    //output
    for (int i = 0; i < number.length; i++) {
       if(number[i] == x){
        System.out.println(i);
       }
    }

    }
}
