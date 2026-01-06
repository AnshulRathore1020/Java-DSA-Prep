

public class ReverseString {
    public static void main(String[] args) {
        String str="Anshul";
        String reveString= " ";

       for (int i = str.length() -1; i >= 0; i--) {
         reveString += str.charAt(i);
       }
       System.out.println(reveString);
    }
}
