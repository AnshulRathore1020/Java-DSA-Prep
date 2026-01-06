
import java.util.HashSet;



public class RemoveDuplicates {
   public static void main(String[] args) {
    String str = "aabbcc";
    HashSet<Character> unique=new HashSet<>();
    

    for (int i = 0; i < str.length(); i++) {
        unique.add(str.charAt(i));
    }
    System.out.println("After removing duplicates Unique element are  :"+unique);
  
   } 
}
