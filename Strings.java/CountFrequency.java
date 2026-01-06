import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {

        String str="aabbccd";
        

        HashMap<Character, Integer> freqMap = new HashMap<>();


        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);

            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }
        for(char key:freqMap.keySet()){
            System.out.println(key + " ->"+freqMap.get(key));
        }

        

    }
}
