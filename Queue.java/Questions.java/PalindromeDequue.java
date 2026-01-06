//Question check whether a string is palindrome or not using DeQueue
import java.util.*;

public class PalindromeDequue {
    public static boolean isPalindrome(String str){
        Deque<Character> dq = new LinkedList<>();
        for(int i=0;i<str.length();i++){
            dq.addLast(str.charAt(i));
        }

        while(dq.size() >1){
            if(dq.removeFirst() != dq.removeLast()){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {

        String str = "level";
        System.out.println(" Is Palindrome : "+isPalindrome(str));
    }

}
