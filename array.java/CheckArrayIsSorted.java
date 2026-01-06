public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        boolean istrue = true;
        for(int i=0;i<arr.length -1;i++){
            if(arr[i] > arr[i+1]){
                istrue = false;
                break;

            }
        }
        if(istrue){
            System.out.println("Array is sorted ");
        }else{
            System.out.println("array is not sorted");
        }
    }
}
