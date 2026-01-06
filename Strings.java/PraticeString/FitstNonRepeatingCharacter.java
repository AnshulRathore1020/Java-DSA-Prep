

public class FitstNonRepeatingCharacter {
    public static void main(String[] args) {
        
        String str="aabbcdd";



        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("first non-repeating charcter is :"+ch);
                break;
            }
            
        }
        
    }
}
