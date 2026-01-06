// Merged two sorted arrray 
// Without using extra space

public class MergedTwoSortedArray1 {


    public static void main(String[] args) {
        int[] arr1={1,2,3,0,0,0};
        int[] arr2={2,5,6};

        int m=3;
        int n=arr2.length;

        int i = m - 1;      // last valid element in arr1
        int j = n - 1;      // last element in arr2
        int k = m + n - 1;

        while(i >= 0 && j >= 0){
            if(arr1[i] > arr2[j]){
                arr1[k--]=arr1[i--];
            }
            else{
                arr1[k--]=arr2[j--];
            }
        }
        while(j >= 0){
            arr1[k--]=arr2[j--];
        }

        for(int num:arr1){
            System.out.print(num+" ");
        }

    }
}
