//ye 3 type ke hote hai 1. non perameterized , 2. perameterized , 3.copy constructor 
 class Student{
    String name ;
    int age ;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }

    public Student(String name,int age) {
        this.age=age;
        this.name=name;
    }
    
}
public class Constructor {
   public static void main(String[] args) {
     Student s1 =  new Student("anshul", 20);
    s1.printinfo();
   }
}
