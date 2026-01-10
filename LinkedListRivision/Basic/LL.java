

public class LL {
    Node head;
    private int size;

    public LL() {
        this.size=0;
    }

    
    class Node{
        String data;
        Node next;

        public Node(String data) {
            this.data=data;
            this.next=null;
            size++;
        }

        
    }
  
    public void AddFirst(String data){
        Node newnNode=new Node(data);
        if(head == null){
            head=newnNode;
            return;
        }
        
        newnNode.next=head;
        head=newnNode;
    }

    public void addlast(String data){
        Node newnNode=new Node(data);
        if(head == null){
            head=newnNode;
            return;
        }
        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newnNode;
    }
    public void print(){
      
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.print(" Null  ");
        
    }
    public void DeleteFirst(){
        if(head == null){
            return;
        }
        size--;
        head=head.next;
    }

        public void DeleteLast(){
        if(head == null){
            return;
        }
        size--;
        if(head.next == null){
            head =null;
        }
      Node  Secondlast=head;
      Node lastNode=head.next;
      while(lastNode.next != null){
        Secondlast=Secondlast.next;
        lastNode=lastNode.next;
      }
      Secondlast.next=null;

    }
    public int getsize(){
        return size;
    }

    public static void main(String[] args) {
        LL list=new LL();
        list.AddFirst("1");
        list.AddFirst("2");
        list.addlast("3");
         list.addlast("4");
         list.print();
         list.DeleteFirst();
         list.print();
         list.DeleteLast();
         list.print();
         System.out.println(list.getsize());
         

         
          
      
    }
}
