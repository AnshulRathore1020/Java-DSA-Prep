public class MissingNumber {
 public static void main(String[] args) {


    int[] arr={0,1,2,3,4,5,6,8,9};
    int n= arr.length;
    int totalsum= n*(n+1) /2;
    int actualsum=0;
    for(int num:arr){
      actualsum += num;
    }
    int fina=totalsum-actualsum;
    System.out.println(fina );

 }
}
