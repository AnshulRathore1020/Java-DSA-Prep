public class concatenation {
    public static void main(String[] args) {
        String firstName = "Anshul";
        String LastNaame = "Rathore";
        String FullName = firstName+" "+LastNaame;

        // System.out.println(FullName.length());

        for (int i = 0; i < FullName.length(); i++) {
            System.out.println(FullName.charAt(i));
        }
    }
}
