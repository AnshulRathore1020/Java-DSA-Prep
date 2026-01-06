//Count Even and Odd numbers
public class Que4 {
 public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
    int odd=0, even =0;
    for(int num:arr){
        if(num % 2 == 0)
        even++;
        else
        odd++;

        
    }
    System.out.println(even);
    System.out.println(odd);
 }   
}
