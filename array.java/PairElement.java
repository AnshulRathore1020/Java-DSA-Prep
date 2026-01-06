

public class PairElement {


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int Target=6;
        int left=0;
        int right=arr.length-1;

        while(left < right){
            int sum=arr[left] + arr[right];

            if(sum == Target){
                System.out.println(arr[left] + " "+arr[right]);
                break;
            }else if(sum < Target){
                left++;
            }else{
                right--;
            }
        }

    }
}
