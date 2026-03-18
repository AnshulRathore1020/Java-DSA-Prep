public class CountNumberGreaterThanx {
    public static void main(String[] args) {
        int[] arr={1 ,7, 3, 10, 5, 2};
        int x=5;
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > x){
                count++;
            }
        }System.out.println(count);
    }

}
