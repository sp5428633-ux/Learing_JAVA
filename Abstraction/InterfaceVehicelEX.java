
// Interface vehicle
 interface  Vehicle {

     void stop();

     void start();
}

// Car class
class Car  implements  Vehicle{
    

  public   void start(){
        
        System.out.println("Car Started:");
    }

   public  void stop(){
        System.out.println("Car going to stop:");
    }

    

}
// Bike class
class Bike  implements  Vehicle{
    

  public  void start(){
        
        System.out.println("Bike Started:");
    }

  public  void stop(){
        System.out.println("Bike going to stop:");
    }


   
}


public class InterfaceVehicelEX {
    public static void main(String[] args) {
    Vehicle c1= new Car();

    Vehicle  b1=new Bike();

    c1.start();
    c1.stop();
    
     b1.start();
     b1.stop();

    }
}


