import java.util.*;
public class ChackAnagram {
    public static void main(String[] args) {
      String str1="silent";
      String str2="lisent";
      
      if(str1.toLowerCase().length() != str2.toLowerCase().length()){
        System.out.println("Its not a anagram ");
        return;
      }

      char arr1[]=str1.toCharArray();
      char arr2[]=str2.toCharArray();

      Arrays.sort(arr1);
      Arrays.sort(arr2);
      
      if(Arrays.equals(arr1, arr2)){
        System.out.println("Its a anangram");
      }else{
        System.out.println("not a anagram");
      }

      
    }
}
