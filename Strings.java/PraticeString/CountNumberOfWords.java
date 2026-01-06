
// Input:  "Java is awesome"
// Output: 3

public class CountNumberOfWords {
    public static void main(String[] args) {
        String sentance="My name is Anshul";

       sentance= sentance.trim();
       
       String[] words=sentance.split("\\s+");
       System.out.println(words.length);

    }
}
