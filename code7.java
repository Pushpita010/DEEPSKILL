import java.util.LinkedList;
import java.util.Queue;

public class code7 {
    public static void main(String args[]){
        Queue<Integer> q1= new LinkedList<>();
        q1.add(10);
        q1.add(33);
        q1.add(40);
        System.out.println(q1.remove());
        System.out.println(q1.peek());
        System.out.println(q1);


    }
}
