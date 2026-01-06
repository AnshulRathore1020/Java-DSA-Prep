import java.util.ArrayList;

public class RemoveDuplicates{
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>();
        original.add(1);
        original.add(1);
        original.add(2);
        original.add(2);
        original.add(3);
        original.add(3);
        original.add(2);


        ArrayList<Integer> unique = new ArrayList<>();

        for(int num : original){
            if(!unique.contains(num)){
                unique.add(num);

            }
        }

        System.out.println("original list " + original);
        System.out.println("unique list " + unique);
    }
}