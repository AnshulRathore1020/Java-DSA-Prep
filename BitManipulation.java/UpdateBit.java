import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opr =sc.nextInt();

        int n=5;
        int pos = 1;

        int bitMask = 1 <<pos;
        if(opr == 1){
            int newnumber = bitMask | n;
            System.out.println(newnumber);
        }
        else{
         int newnumber = bitMask & n;
         System.out.println(newnumber);

        }

    }
}
//isme ager 1 update karna hai to sate ki process kar do 
// or ager 0 update karna hai to clear ki process kar do