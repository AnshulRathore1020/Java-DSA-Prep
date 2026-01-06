import java.util.*;

public class FirstNonRepeatingChar {
    public static void PrintFirstNonReapting(String str){
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch - 'a']++;
            q.add(ch);

            while(!q.isEmpty() && freq[q.peek() - 'a'] >1){
                q.remove();

            }
            if(q.isEmpty()){
                System.out.print("-1");
            }else{
                System.out.print(q.peek() +" ");
            }
        }
    }
    public static void main(String[] args) {
        String str= "aabc";
        PrintFirstNonReapting(str);
    }
}
