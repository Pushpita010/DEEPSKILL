class Student{
    int age;
    String name;
    static  String college="KIIT";}



public class code5 {
    public static void main(String args[]){
                Student s1=new Student();
                s1.name="Ronit";
                s1.age=3;
   Student s2=new Student();
                System.out.println(s1.college);
                System.out.println(s2.college);
    }
}