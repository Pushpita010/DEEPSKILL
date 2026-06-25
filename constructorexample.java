class Student{
    Student(){
        System.out.println("Default");
    }

    Student(int age){
        this();
        System.out.println("Parameterized");
    }
}

public class constructorexample{
    public static void main(String[] args){
        Student s1 = new Student(20);
    }
}