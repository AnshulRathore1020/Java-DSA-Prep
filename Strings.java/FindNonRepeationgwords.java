
import java.util.HashMap;

public class FindNonRepeationgwords {
 public static void main(String[] args) {
    String str = "aabbcdd";

    HashMap<Character,Integer> nonrep=new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
        char ch=str.charAt(i);
        nonrep.put(ch, nonrep.getOrDefault(ch, 0)+1);
    }
    for (int i = 0; i < str.length(); i++) {
        char ch=str.charAt(i);
        if(nonrep.get(ch) ==1){
            System.out.println("First non-repeating character is :"+ch);
            return;
        }
    }
    System.out.println("NO non-repeating character found");

   
 }   
}
