 class Student{
    String name ;
    int age ;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
}


public class objectandclass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 20;
        s1.name = "Anshul rathore";
        s1.printinfo();
    }
}
