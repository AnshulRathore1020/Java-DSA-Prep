public class ReverseSentance {
    public static void main(String[] args) {
        String sentence = "I am busy today";

        String[] words = sentence.split(" ");
        String reversed = "";
        for(int i= words.length -1;i >=0;i--){
            reversed += words[i];
            if(i != 0){
                reversed += " ";
            }
        }
        System.out.println("reversed sentence : " + reversed);

    }
}
