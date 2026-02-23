import java.util.Scanner;
class Vehical{
    void vehical(){
        System.out.println("Vehical");
    }
}

class FourWheeler extends Vehical{
    FourWheeler(){
        System.out.println("FourWheeler");
    }
}

class Car extends FourWheeler{
    Car(){
        System.out.println("Car");
    }
}

public class multilevel{
    public static void main(String[] args){
        Car obj = new Car();
        
    }
}