  interface Vehicle{
        
    }
class Bike implements Vehicle{

}
class Car implements Vehicle{

}
class Truck implements Vehicle{

}

public class factorypatter {
  public Vehicle getVehicle(String type){
  if("Bike".equals(type)){
        return new Bike();
    } 
  if("Car".equals(type)){
        return new Car();
    } 
  if("Truck".equals(type)){
        return new Truck();
    } 

  return null;

}

}
