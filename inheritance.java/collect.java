

 class shape {
   public int age;
    
   }



class Circle extends shape{
}

class Triangle extends Circle{
    public void area(String name){
        System.out.println("my name is ajay");
    }
}


public class collect{
    public static void main(String[] args) {
    
        Triangle t1 = new Triangle();
        t1.area("ajay");
       

    }
}
// there are four types of inheritanace in java 
// 1.single inheritance , 2.multiple inheritance , 3.hierchale inheritance , 4. hybrid inheritance
//reusability bdti hai


