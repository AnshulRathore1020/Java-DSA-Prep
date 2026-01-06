//occurance ka matlab hai ki jaise koi string hai aabsczab to isme a
// vo pheli baar kha dikha or last baar kha dikha vo btana hai //
public class FirstandLastOccuranc{

    public static int First = -1;
    public static int Last = -1;

    public static void printindex(String str, int index ,char element ){
        if(index == str.length()){
            System.out.println(First);
            System.out.println(Last);
            return;
        }
        char currentchar =str.charAt(index);
        if(currentchar == element){
            if(First == -1){
                First =index;
            }
            else{
                Last = index;
            }
        }
        printindex(str, index+1, element);
    }

        public static void main(String[] args) {
        String str = "abaacdaefaah";
        printindex(str, 0, '0');
    }
}