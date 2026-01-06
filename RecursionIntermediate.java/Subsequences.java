public class Subsequences {
    public static void printsubsequences(String str, int index , String newstring){
        if(index==str.length()){
            System.out.println(newstring);
            return;
        }
        
        char charcter = str.charAt(index);
        //to be 
        printsubsequences(str, index +1, newstring+charcter);

        //or not be
        printsubsequences(str, index +1, newstring);

    }
    public static void main(String[] args) {
        String str ="abc";
        printsubsequences(str, 0, "");
    }
}
