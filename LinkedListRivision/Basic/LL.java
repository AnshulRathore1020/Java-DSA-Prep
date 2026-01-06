

public class LL {
    Node head;
    class Node{
        String data;
        Node next;

        public Node(String data) {
            this.data=data;
            this.next=null;
        }

        
    }
    // Add first
    public void addfirst(String data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    

    //print

    public void print(){
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.println("null");

    }


    // Add Last
    public void addlast(String data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;


    }

    // DeleteFirst
   public void DeleteFirst(){
    if(head == null){
        System.out.println("List is empty");
        return;

    }
    head=head.next;
   }

   // DeleteLast
   public void DeleteLast(){
    if(head == null){
        System.out.println("List is empty");
        return;
    }
    Node secNode=head;
    while(secNode.next.next != null){
        secNode=secNode.next;
    }
    secNode.next=null;

   }

   // Search Element
   public boolean  SearchElement(String key){
    Node currNode=head;
    while(currNode != null){
        if(currNode.data.equals(key)){
            return true;
        } 
        currNode=currNode.next;

    }
    return false;
   }

   // Reverse Linked List

   public void Reverse(){

    if(head == null || head.next == null){
        return ;
    }
    Node previouNode=head;
    Node currNode=head.next;
     
    while(currNode != null){
        Node nextNode=currNode.next;
        currNode.next=previouNode;

        //update
        previouNode=currNode;
        currNode=nextNode;
    }
    head.next=null;
    head=previouNode;

    
   }


    public static void main(String[] args) {
        LL list=new LL();
        list.addfirst("a");
        list.addfirst("b");
        list.print();

        list.addlast("z");
        list.print();

        list.DeleteFirst();
        list.print();

        list.DeleteLast();
        list.print();

        System.out.println("Search key " + list.SearchElement("a"));

        list.addlast("b");
        list.addlast("c");
        list.addlast("d");

        list.Reverse();
        list.print();

      

        
    }


}
