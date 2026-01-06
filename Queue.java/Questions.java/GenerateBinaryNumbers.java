
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers{

    public static void GenerateBinaryNumbers(int n){
        Queue<String> q=new LinkedList<>();
        q.add("1");
        for (int i = 1; i <= n; i++) {
            String curr=q.remove();
            System.out.println(i+" : "+curr + " ");

            q.add(curr+"0");
            q.add(curr+"1");
        }
        
        
    }
    public static void main(String[] args) {
        int n=50;
        System.out.println("Binary numbers from 1 to " + n + ":");
        GenerateBinaryNumbers(n);
    }
}