public class logger {
    private  static logger log=new logger();//object created private
    private logger(){}//blank constructor may b id k 
   public static logger getlogger(){//method to access
    return log;
   }
}
