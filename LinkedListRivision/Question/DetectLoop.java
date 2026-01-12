
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        this.next=null;

    }

    
}

public class DetectLoop {
     public static boolean iscycle(Node head){
        Node slow=head;
        Node fast=head;

        if(head == null || head.next == null){
            System.out.println("there is no cyle");
            return false;
        }

        while(fast != null && fast.next != null ){
            slow=slow.next;
            fast=fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;

     }

     public static void main(String[] args) {
        Node h1=new Node(1);
        h1.next=new Node(2);
        h1.next.next=new Node(3);
        h1.next.next.next=new Node(4);
        h1.next.next.next.next=new Node(5);
        System.out.println(DetectLoop.iscycle(h1));

        h1.next.next.next.next.next = h1.next;
        System.out.println(DetectLoop.iscycle(h1));


        
        
     }
}
