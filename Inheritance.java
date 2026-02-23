class Cars {
    void sound(){
        System.out.println("cars makes a sound");
    }
}
class BMW extends Cars {
    void sound(){
        System.out.println("BMW");
    }
}
class Audi extends Cars{
    void sound(){
        System.out.println("Audi");
    }
}
class Benz extends Cars{
    void sound(){
        System.out.println("Benz");
    }
}
public class Inheritance{
	public static void main(String[] args) {
		Cars a;
		a = new BMW();
		a.sound();
		
		a= new Audi();
		a.sound();
		
		a = new Benz();
		a.sound();
	}
}