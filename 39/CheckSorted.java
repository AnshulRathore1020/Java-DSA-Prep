public class CheckSorted {

    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        boolean issort=true;

        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i] > arr[i+1]){
                issort=false;
                 break;
            }
        }
        if(issort){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
