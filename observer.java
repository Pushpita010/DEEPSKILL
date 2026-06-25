import java.util.ArrayList;

class weatherstation{
    ArrayList<notify> obs= new ArrayList<>();
    void addobserver(notify Name){
        obs.add(Name);
    }
    void notifyObservers(){

    for(notify n : obs){
        n.send();
    }

}
}
interface notify{
    void send();
}
class Phonedisplay implements notify{
    public void send(){
        System.out.println("SEnding");
    }
}
class Tabdisplay implements notify{
    public void send(){
        System.out.println("SEnding");
    }
}
class Laptopdisplay implements notify{
    public void send(){
        System.out.println("SEnding");
    }
}
public class observer {
    public static void main(String args[]){
        weatherstation ws=new weatherstation();
       
        Phonedisplay p= new Phonedisplay();
        Tabdisplay t= new Tabdisplay();
     ws.addobserver(p);
     ws.addobserver(t);
        

    }
    
}
