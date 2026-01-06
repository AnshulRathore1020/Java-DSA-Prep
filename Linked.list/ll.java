class ll{
    Node head;
    private int size;
    ll(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        public Node(String data) {
            this.data=data;
            this.next = null;
            size++;

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

    //Remove first
    public void DeleteFirst(){
        if(head == null){
            System.out.println("String is empty");
        }
        size--;
         head = head.next;
    }

    //Remove last
    public void DeleteLast(){
          if(head == null){
            System.out.println("String is empty");
        }
        size--;
       if(head.next == null){
        head = null;
       }
       Node Secondlast = head;
       Node LastNode = head.next;
       while(LastNode.next != null){
        LastNode = LastNode.next;
        Secondlast = head.next;
       }
       
       Secondlast.next = null;
    }

    public int getsize(){
        return size;
    }

    public void reverLinkedlist(){
        if(head == null || head.next == null) {
            return;
        }

        Node previous = head;
        Node CurrNode = head.next;
        while (CurrNode != null) { 
            Node nextNode = CurrNode.next;
            CurrNode.next= previous;

            //update
            previous = CurrNode;
            CurrNode = nextNode;
        }
        head.next = null;
        head = previous;
    }


    public static void main(String[] args) {
        ll list = new ll();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();

        list.addlast("list");
        list.printlist();
        list.addfirst("This");
        list.printlist();

        list.DeleteFirst();
        list.printlist();

        list.DeleteLast();
        list.printlist();
        
        System.out.println(list.size);
        list.addfirst("this");
        System.out.println(list.size);

        // for rever the linked list with iterable
        list.addfirst("b");
        list.addfirst("a");
        list.addlast("c");
        list.printlist();
        list.reverLinkedlist();
        list.printlist();
        

    }
}