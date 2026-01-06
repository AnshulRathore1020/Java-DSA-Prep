

public class CheckStringRotaionOfAnother {
    
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="CDAB";

        if(str1.length() != str2.length()){
            System.out.println("Not rataion of another");
        }

        String combined=str1+str1;

        if(combined.contains(str2)){
            System.out.println("Rotaion");
        }else{
            System.out.println("Not rotaion");
        }
    }
}
