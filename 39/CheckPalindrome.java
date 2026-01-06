

public class CheckPalindrome {

    public static void main(String[] args) {
        String str="le";

        int left=0;
        int right=str.length()-1;
        boolean isPalindrome=true;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("String is palindrome");
        }else{
            System.out.println("this is not palindrome");
        }
        

        
//         String str="level";
//         String reversed= new StringBuilder(str).reverse().toString();
//         if(str.equals(reversed)){
//             System.out.println("String is palindrome");
//         }
// else{
//     System.out.println("String is not palindrome");
// }

    }
}
