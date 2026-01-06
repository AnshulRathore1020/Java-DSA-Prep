public class BuySellStock {

    public static int BAS(int arr[]){

        int min = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int price:arr){
            if(price < min){
                min = price;
            }
            else{
                int profit = price - min;
                if(profit > maxprofit){
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,3,4,5};
        System.out.println(BAS(arr));

    }
}
