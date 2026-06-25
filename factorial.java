public class factorial {
    public int fact(int n){
        if(n==0){
            return 0;
        }
        else{
            return n + fact(n-1);
        }
    }
    public static void main(String args[]){
        
        factorial obj = new factorial();

        int result = obj.fact(5);

        System.out.println(result);  
    }
    
}
