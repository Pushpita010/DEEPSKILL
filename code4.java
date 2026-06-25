class Student{
    int age;
    String name;
    Student(int age,String name){
        this.name=name;
        this.age=age;
    }
    Student(Student s1){
        this.name=s1.name;
        this.age=s1.age;
    }
}

public class code4 {
    public static void main(String args[]){
        Student s1=new Student(45,"Amir");
        Student s2=new Student(s1);
        System.out.println(s1.name);
        System.out.println(s2.age);

    }
}
