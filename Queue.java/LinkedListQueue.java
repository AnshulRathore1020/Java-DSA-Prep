public class LinkedListQueue{
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
        
    }
    Node front,rear;

    LinkedListQueue(){
        this.front=null;
        this.rear=null;
    }

    public void enqueue(int data){
        Node newNode=new Node(data);
        if( rear == null){
            front=rear=newNode;
            System.out.println(data + "Added");
            return;
        }
        rear.next=newNode;
        rear=newNode;
        System.out.println(data+"Added");
    }
    public void dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(front.data + "Delelted");
        front=front.next;
        if(front == null){
            rear=null;
        }
    }
    public void peek(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(front.data+"Peek");
    }
    public void display(){
        Node temp=front;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
            LinkedListQueue q = new LinkedListQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();

        q.peek();
    }
}