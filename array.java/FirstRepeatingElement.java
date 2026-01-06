
import java.util.HashSet;





//first repeating element in arr
public class FirstRepeatingElement {
    
    public static void main(String[] args) {
        int arr[]={1,1,1,2,5,2,5,2,5,2,3,6,9,5,2,4,1,7,8,9,3,5,8,9,3,5,8,6,5,5};
       HashSet<Integer> seen=new HashSet<>();

       for(int num:arr){
        if(seen.contains(num)){
            System.out.println("first repeating element is :" + num);
            return;
        }
        else{
            seen.add(num);
        }
       }


      
        
    }
}
