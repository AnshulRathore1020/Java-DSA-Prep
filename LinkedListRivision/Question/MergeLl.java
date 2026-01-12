
//merge two sorted linked list
//Pattern : merge/pointer rewring
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        this.next=null;
    }
    
}
public class MergeLl {
    public static Node MergeTwoList(Node l1,Node l2){
        Node dummy=new Node(-1);
        Node tail=dummy;

        while(l1 != null && l2 != null){
            if(l1.data <= l2.data){
                tail.next=l1;
                l1=l1.next;
            }else{
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
         if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next; 
    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
        public static void main(String[] args) {
        // First sorted list: 1 -> 3 -> 5
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        // Second sorted list: 2 -> 4 -> 6
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        Node merged = MergeTwoList(l1, l2);
        printList(merged); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
    }

}
