
//merged two sorted array 
//taking extra space 

public class MergedTwoSortedArray {
   public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,10,12,14};
        int[] arr2 = {6,7,8,9,11,13};
        
        int n=arr1.length;
        int m=arr2.length; 

        int[] merged=new int[n+m];

        int i=0,j=0,k=0;

        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                merged[k++]= arr1[i++];
            }
            else{
                merged[k++]=arr2[j++];
            }
        }

        while( i < n){
            merged[k++]=arr1[i++];
        }

        while( j < m){
            merged[k++]=arr2[j++];
        }

        System.out.println("Merged sort arr :");

        for(int num : merged){
            System.out.print(num + " ");
        }
        
   }
        
       
}
