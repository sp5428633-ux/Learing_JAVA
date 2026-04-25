// abstract class vehicle
abstract class Vehicle {
     int tyres; 

     void display(){
        System.out.println("Vehicle has :" + tyres + " Tyres");
    }

     abstract void start();
}

// Car class
class Car  extends Vehicle{
    

    void start(){
         tyres=4;
        System.out.println("Car Started:");
    }

    

}
// Bike class
class Bike  extends Vehicle{
    

    void start(){
        tyres=2;
        System.out.println("Bike Started:");
    }

   
}


public class Main {
    public static void main(String[] args) {
    Car c1= new Car();

    Bike  b1=new Bike();

    c1.start();
    c1.display();
    
    //  b1.start();
    //  b1.display();

    }
}
