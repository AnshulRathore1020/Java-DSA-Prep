import java.util.Scanner;

public class practice {
    
public static void checkevenornot(int n){
    if(n % 2 == 0){
        System.out.println("number is even");
    }
    else{
        System.out.println("number is not even");
    }
}



public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int  n= sc.nextInt();
    checkevenornot(n);
}

}
