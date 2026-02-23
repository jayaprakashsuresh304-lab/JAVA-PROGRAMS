class Vehicle {
    public void drive() {
        System.out.println("drive");
    }
}
class Bike extends Vehicle {
    @Override
    public void drive() {
        System.out.println("driving bike");
    }
}
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("driving car");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.drive();
        Vehicle a = new Car();
        a.drive();
        Vehicle b = new Vehicle();
        b.drive();
    }
}