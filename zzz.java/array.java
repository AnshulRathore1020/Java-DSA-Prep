



public class array {
    
    public static void main(String[] args) {
        int arr[]={10,20,1000,40,50,60,70};
        boolean isAsc=true;
        boolean isDsc=true;

        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i] > arr[i+1]){
                isAsc=false;

            }
            if(arr[i] < arr[i+1]){
                isDsc=false;
            }
        }
        if(isAsc){
            System.out.println("Arr is sorted in asc order");
        }
        else if(isDsc){
            System.out.println("arr is sorted in dsc order");
        }
        else{
            System.out.println("Arr is not sorted");
        }
     

        
    }
}
