

public class PrintPrime {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) {
            boolean isprime = true;
            for(int num=2;num<=Math.sqrt(i);num++){
                if(i % num ==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i + " ");
            }
        }
       
    }
}
