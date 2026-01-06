//Reverse a string 

public class que1 {
    public static void main(String[] args) {
        String str=" anshul";
        String s=" ";
        for (int i = str.length() -1 ; i >= 0 ; i--) {
            s += str.charAt(i);
        }
        System.out.println(s);



        //   String str = "anshul";

//         // Using StringBuilder (fast and memory efficient)
//         StringBuilder sb = new StringBuilder(str);
//         String reversed = sb.reverse().toString();

//         System.out.println("Original: " + str);
//         System.out.println("Reversed: " + reversed);
    }
}


