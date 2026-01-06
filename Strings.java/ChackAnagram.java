import java.util.Arrays;
public class ChackAnagram {
    public static void main(String[] args) {
      String str1="silent";
      String str2="lisenk";
      
      str1.toLowerCase();
      str2.toLowerCase();

      if(str1.length() != str2.length()){
        System.out.println("its not anagram");
        return;
      }

      
      char[] arr1=str1.toCharArray();
      char[] arr2=str2.toCharArray();

      Arrays.sort(arr1);
      Arrays.sort(arr2);

      if(Arrays.equals(arr1, arr2)){
        System.out.println("Its a anagram");
      }else{
        System.out.println("Its not a anagram");
      }
      
    }
}
