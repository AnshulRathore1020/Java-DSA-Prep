public class StringIsPalindrome {
    public static void main(String[] args) {
        String str="lvel";
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
            System.out.println("its a palindrome ");
            
        }else{
            System.out.println("its nota a palindorme ");
        }

        
    }
}
