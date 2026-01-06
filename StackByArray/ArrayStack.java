public class ArrayStack {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
        
    }
    static class stack{
         Node head;
        public boolean isEmpty(){
            return head == null;
        }

        public void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

             
    

            
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        public void pushatbottom(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
            }
            Node top=head;
            while(top.next != null){
                top=top.next;

            }
            top.next=newNode;
        }
    }
    public static void main(String[] args) {
       stack s = new stack();
       s.push(10);
        s.push(20);
         s.push(30);
          s.push(40);
          s.pushatbottom(05);

          while(!s.isEmpty()){
            System.out.println(s.pop());
          }


    }
}
