public class MoveZero {

    public static void pushzero(int arr[]){
       int index=0;
       for (int i = 0; i < arr.length; i++) {
           if(arr[i] != 0){
            arr[index]=arr[i];
            index++;
           }
          
       }
       while(index < arr.length){
        arr[index]=0;
        index++;
       }
    }

    public static void main(String[] args) {
        int arr[]={4,5,0,1,9,0,5,0};
        pushzero(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
