public class BackTrack {

    public static void printpermitation(String str, String perm,int index){
       
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currchar =str.charAt(i);
            String newstring = str.substring(0,i) + str.substring(i+1);
            printpermitation(newstring, perm + currchar, index +1);
        }
   
    }

    public static void main(String[] args) {
        String str = "ABC";
        printpermitation(str, "", 0);
    }
}
