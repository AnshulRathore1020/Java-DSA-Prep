
public class CheckPrime {
    public static void main(String[] args) {
        int num= 3;
        boolean isprime=true;

        if(num <= 1){ isprime=false;
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num % i ==0){
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime number");
        }
    }
}
