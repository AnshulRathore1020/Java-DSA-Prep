
import java.util.Stack;

public class nextgreater {
    
   public static int[] nextgreaterelement(int []arr){
    int n=arr.length;
    int result[]=new int[n];
    Stack<Integer> stack= new Stack<>();

    for(int i= n-1;i >=0;i--){
        while(!stack.isEmpty() && stack.peek() <= arr[i]){
            stack.pop();
        }
        if(stack.isEmpty()){
            result[i]=-1;

        }else{
            result[i]=stack.peek();
        }
        stack.push(arr[i]);
    }
    return result;
   }
   public static void main(String[] args) {
    int[]arr={10,20,50,40,80,10,20,50};
    int[]result=nextgreaterelement(arr);
    System.out.println("next greater element :");
    for(int num:result){
        System.out.print(num + " ");
    }
   }

}
