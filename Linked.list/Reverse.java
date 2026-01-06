//reverse linked list with iterative (loop)

public class Reverse {
    Node head;
    class Node{
    String data;
    Node next;

    public Node(String data) {
        this.data=data;
        this.next=null;
    }
    

}
       //add - first
    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    //add - Last
    public void addlast(String data){
         Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return ;
        }
        Node CurrNode = head;
        while(CurrNode.next != null){
            CurrNode = CurrNode.next;
        }
        CurrNode.next=newNode;

    }
    //print
    public void printlist(){
        Node CurrNode = head;
        while(CurrNode != null){
            System.out.print(CurrNode.data + " -> ");
            CurrNode = CurrNode.next;
        }
        System.out.println("Null");
        

    }


    public  void reverselist(){
        if(head == null || head.next == null){
            return;
        }
        Node previous = head;
        Node Currunt = head.next;
        while(Currunt != null){
            Node nextNode = Currunt.next;
            Currunt.next=previous;
            //update
            previous = Currunt;
            Currunt = nextNode;


        }
        head.next = null;
        head=previous;
    }
    public static void main(String[] args) {
        Reverse list= new Reverse();
        list.addfirst("b");
        list.addfirst("a");
        list.addlast("c");
        list.printlist();
        list.reverselist();
        list.printlist();

    }
}
