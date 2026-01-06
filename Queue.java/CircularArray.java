
// means queue ko implement karenge circlur array se 
public class CircularArray {
    static class Circular{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        public Circular(int n){
            arr = new int[n];
            this.size = n;
        }
       public static boolean isEmpty(){
        return rear == -1 && front == -1;
       }
       public static boolean isFull(){
        return (rear +1) % size == front;
       }
       //enqueue
       public static void add(int data){
        if(isFull()){
        System.out.println("queue is full");
        return;
       }
       if(front == -1){
        front =0;
       }
       rear = (rear + 1) % size;
       arr[rear] = data;
    }
    //remove
    public static int remove(){
        if(isEmpty()){
            return -1;
        }
        int result = arr[front];
        if(rear == front){
            rear = front = -1;
        }
        else{

            front = (front + 1) % size;
        }
        return result;
        
    }
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    

     
    }
    public static void main(String[] args) {
        Circular c = new Circular(5);
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        System.out.println(c.remove());
        c.add(6);
        System.out.println(c.remove());
        c.add(7);

        while(!c.isEmpty()){
            System.out.println(c.peek());
            c.remove();
        }
}
}