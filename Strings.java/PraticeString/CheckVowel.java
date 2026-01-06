

public class CheckVowel {
    public static void main(String[] args) {
        String str="anshul";
        str.toLowerCase();

        int vowel=0;
        int consonants=0;
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch >='a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e'||ch == 'i' ||  ch == 'o' || ch =='u' ){
                    vowel++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("Number of vowels in given string is :"+vowel);
        System.out.println("Number of Consonent in given string is :"+consonants);
    }
}
