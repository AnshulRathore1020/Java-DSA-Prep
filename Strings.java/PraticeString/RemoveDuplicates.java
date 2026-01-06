
import java.util.HashSet;

public class RemoveDuplicates {
    


    public static void main(String[] args) {
        String str="aabbcccd";
        StringBuilder unique=new StringBuilder();
        StringBuilder duplicate=new StringBuilder();

        HashSet<Character> seen=new HashSet<>();

        for(char ch:str.toCharArray()){
            if(!seen.contains(ch)){
                seen.add(ch);
                unique.append(ch);
            }
            else{
                duplicate.append(ch);
            }
        }
        System.out.println("Unique :"+unique);
        System.out.println("Duplicates :"+duplicate);


    }

}
