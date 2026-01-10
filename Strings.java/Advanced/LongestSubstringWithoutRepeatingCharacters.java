
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

        public static int substring(String S){

            int left=0;
            int maxlen=0;
            HashSet<Character> set=new HashSet<>();

            for (int right = 0; right < S.length(); right++) {
                char ch=S.charAt(right);
                
                while(set.contains(ch)){
                    set.remove(S.charAt(left));
                    left++;
                }
                set.add(ch);
                maxlen=Math.max(maxlen, right -left +1);
            }
            return maxlen;
    }


    public static void main(String[] args) {
        String s="aababcbb";
        System.out.println("Lonegest substring without repeating charcter is :"+substring(s));


    }
}
