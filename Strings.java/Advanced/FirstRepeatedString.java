
import java.util.HashSet;

//find the first repeated character in a string

public class FirstRepeatedString {
    public static void main(String[] args) {
        String str="geeksforgeeks";

        HashSet<Character> seen=new HashSet<>();

        char repeated='0';

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(seen.contains(ch)){
                repeated = ch;
                break;
            }else{
                seen.add(ch);
            }
        }
        if(repeated != 0){
            System.out.println("First repeated string is :"+repeated);
        }else{
            System.out.println("their is no repeated string");
        }
    }
}
