
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key");
    }
}
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a kick");
    }
}
public class VehicleTest{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Bike b = new Bike();
        v.start();  
        c.start();  
        b.start();  
    }
}
