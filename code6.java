import java.util.Stack;

public class code6{
    public static void main(String args[]){
        Stack<Integer>  s=new Stack<>();
        s.push(10);
        s.push(9);
        s.push(999);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s);
    
    }
}