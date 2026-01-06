
import java.util.HashSet;





public class Duplicates {
    public static void main(String[] args) {


        int arr[]={1,1,1,1,2,5,2,5,1,4,5,4,5,4,0,5,1,4,2,5};

        HashSet<Integer> unique= new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for(int num : arr){
            if(unique.contains(num)){
                duplicate.add(num);
            }else{
                unique.add(num);
            }
        }
        System.out.println("Unique :"+unique);
        System.out.println("Duplicate :"+duplicate);

    }
}
