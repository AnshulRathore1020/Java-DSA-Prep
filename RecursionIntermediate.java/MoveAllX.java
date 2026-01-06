public class MoveAllX{

    public static void movex(String str,int count , int index , String newstring){
    
        if(index == str.length() -1){
            for (int i = 0; i < count; i++) {
                newstring += 'x';
            }
            System.out.println(newstring);
            return;
        }


        char charcter = str.charAt(index);
        if(charcter == 'x'){
            count++;
            movex(str, count, index +1, newstring);
        }
        else{
            newstring += charcter;
            movex(str, count, index +1, newstring);
        }
    }

    public static void main(String[] args) {
        String str ="axbxcxdx";
        movex(str, 0, 0, "");
    }
}