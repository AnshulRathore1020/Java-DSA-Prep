public class kadaneAlgo {


    static int kadane(int arr[]){
        int n=arr.length;
        int currmax=0;
        int maxsofar=0;

        for (int i = 0; i < n; i++) {
            currmax=Math.max(arr[i], currmax + arr[i]);
            maxsofar=Math.max(maxsofar, currmax);
        }
        return maxsofar;

    }
    
    public static void main(String[] args) {


        int arr[]= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(kadane(arr));


    }
}
