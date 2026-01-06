public class ReversString{

    public static void printreverse(String str,int index){
      if(index ==0){
        System.out.println(str.charAt(index));
        return;
      }
        System.out.print(str.charAt(index) + " ");
        printreverse(str, index-1);
    }
    public static void main(String[] args) {
        String str= "ABCD";
        printreverse(str, str.length() -1);
    }

}