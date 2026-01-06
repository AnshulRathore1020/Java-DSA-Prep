//Check if a string contains only digit

public class CheckIfStringOnlyDigit {
    public static void main(String[] args) {
        String str="123a5";
        boolean onlydigit=true;

       for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);

            if(!Character.isDigit(ch)){
                onlydigit=false;
                break;
            }
       }
       if(onlydigit){
        System.out.println("String contains only digit");
       }else{
        System.out.println("String does not contain only digit");
       }

    }
}
