public class Average {
    

    public static void main(String[] args) {
        
        
        int nums[]={1,2,3,4,5};
        
        int sum=0;

        for(int numm:nums){
            sum += numm;
        }System.out.println("Sum :"+sum);

        System.out.println("Average :" + sum/nums.length);
        
    }
}
