

public class Sample{

    int []arr;
    int front;
    int rear;
    int size;

     Sample(int size){
        this.size=size;
        arr= new int[size];
        front=0;
        rear=0;

    }

    public void enqueue(int data){
        if(rear == size){
            System.out.println("Queue is full");
            return;
        }
        arr[rear]=data;
        rear++;
        System.out.println(data+"added");
    }

        public void dequeue(){
            if(front == rear){
                System.out.println("qeque is empty");
                return;
            }
            System.out.println(arr[front]+"deleted");
            front++;
        }

        public void peek(){
            if(front == rear){
                System.err.println("Queue is empty");
                return;
            }
            System.out.println("Peek of quque is :"+arr[front]);
        }

        public void display(){
         if(front == rear){
            System.out.println("Queue is empty");
            return;
         }   
         System.out.println("Queue element");
         for(int i=front;i<rear;i++){
            System.out.print(arr[i] + " ");
         }
         System.out.println();
        }



    public static void main(String[] args) {
          Sample q = new Sample(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();

        q.peek();
    }
}