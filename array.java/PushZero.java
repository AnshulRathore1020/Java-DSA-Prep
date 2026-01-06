public class PushZero{
   public static void PushZero(int arr[]){
    int pos=0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] != 0){
            arr[pos]=arr[i];
            pos++;
        }
        

    }
    while(pos < arr.length){
        arr[pos] =0;
        pos++;
    }
   }
   public static void main(String[] args) {
       int arr[]={10,20,30,0,0,0,0};
       PushZero(arr);
       for(int num : arr){
        System.out.print(num + " ");
       }
       
       
   }
}