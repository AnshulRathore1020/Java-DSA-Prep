//isme bina naya array banae reverse karna hai to 
//array ke first element ko swap kar denge array ke second element se
public class ReverseArray {

    public static void main(String[] args) {
        int [] nums={10,20,30,40,50,60};
        
        int left=0;
        int right=nums.length -1;
        boolean reverse=true;

        while(left < right) {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            left++;
            right--;
        }
        System.out.print("reversed arrary");
        for(int num:nums){
            System.out.print(num);
        }
        
        
        
        }

    }

