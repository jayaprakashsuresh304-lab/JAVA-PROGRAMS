class Vehical{
    Vehical(){
        System.out.println("This is a Vehical");
    }
}
class Car extends Vehical{
    Car(){
        System.out.println("This is a car");
    }
}
class Bus extends Vehical{
    Bus(){
        System.out.println("This is a bus");
    }
}
public class hierarchical{
    public static void main (String[] args) {
        Car obj1 = new Car();
        Bus obj2 = new Bus();
    }
}