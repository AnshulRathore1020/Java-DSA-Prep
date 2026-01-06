
import java.util.Stack;

public class nextsmaller {
    public static int[] nextsmallerelement(int arr[]){
        int n=arr.length;
        int result[]=new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()>arr[i]){
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
        int arr[]={50,40,30,20,10};
        int result[]=nextsmallerelement(arr);

        for(int sus:result){
            System.out.print(sus+" ");
        }

    }
}
