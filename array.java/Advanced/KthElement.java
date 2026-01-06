
import java.util.Collections;
import java.util.PriorityQueue;


public class KthElement {

    // ye thoda optimized nhi hai ager badi chize nhi hogi isse uske liye hmko heap uske karna padega
    // priortityqueue se or uska last element ki k ka largest element hota hai 

    // public static void main(String[] args) {
    //     int[] arr={10,20,50,40,11,1,2,3,4,55,12,66};
    //     int k=3;

    //     Arrays.sort(arr);

    //     int ksmallestElement=arr[k-1];
    //     int klargestElement=arr[arr.length - k];

    //     System.out.println("kthSmallestElement :"+ksmallestElement);
    //     System.out.println("kthLargestElement :"+klargestElement);

    public static void main(String[] args) {
        

        int[] arr={10,20,50,40,11,1,2,3,4,55,12,66};
          int k=3;

          PriorityQueue<Integer> minheap=new PriorityQueue<>();

          for(int num:arr){
            minheap.add(num);
            if(minheap.size() > k){
                minheap.poll();
            }
          }
          int klargestElement=minheap.peek();
          PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
          for(int num:arr){
            maxheap.add(num);
            if(maxheap.size() > k){
                maxheap.poll();
            }
          }
          int ksmallestElement=maxheap.peek();
          
          System.out.println("ksmallestElementis :"+ksmallestElement);
          System.out.println("klargestElementis :"+klargestElement);
    }
    }




