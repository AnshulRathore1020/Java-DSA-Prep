

public class checkFrequency {
    public static void main(String[] args) {
        String str="Anshullll ";
        String processed=" ";
       str= str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(!processed.contains("" + ch)){
                int count=0;
                for (int j = 0; j < str.length(); j++) {
                    if(str.charAt(j) == ch){
                        count ++;

                    }
                }
                System.out.println(ch + " - >" +count);
                processed +=ch;
            }
            
        }
        
    }
}
