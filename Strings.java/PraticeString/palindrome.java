

public class palindrome {


    public static void main(String[] args) {
        String str="level";
        int left=0;
        int right=str.length() -1;
      boolean  isPalin=true;


        while (left < right) { 
            if(str.charAt(left) !=  str.charAt(right)){
                isPalin=false;
                break;

            }
            left++;
            right--;
        }
        if(isPalin){
            System.out.println("String is palindrome ");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
