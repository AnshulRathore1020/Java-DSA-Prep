



public class xyz{
   static class stack{
       int top=-1;
       int size;
       int arr[];

       stack(int size){
        this.size=size;
        arr=new int[size];
       }

       public boolean isEmpty(){
        System.out.println("stack is empty");
        return top == -1;
       }

       public  boolean isFull(){
        System.out.println("stack is full");
        return top == size -1;
       }


       public void push(int data){
        if(isFull()){
            return;
        }
        top++;
        arr[top]=data;
       }
       public int pop(){
        if(isEmpty()){
            return-1;
        }
        int val=arr[top];
        top--;
        return val;
       }

       public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[top];
       }
    }
    public static void main(String[] args) {
        stack s= new stack(6);
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("top of array :"+s.peek());
        s.pop();
      
        System.out.println("top of array :"+s.peek());
        
        s.pop();
        s.pop();
        System.out.println("asdfdas :"+s.isEmpty());
    }
}