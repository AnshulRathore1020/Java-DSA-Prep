

public class PrintNumber {

    public static void printlll(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        printlll(n +1);
    }
    public static void main(String[] args) {
        int n =1;
        printlll(n);
    }
}
