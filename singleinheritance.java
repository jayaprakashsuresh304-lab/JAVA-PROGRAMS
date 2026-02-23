class Family {
    void members() {
        System.out.println("Enter the family members");
    }
}
class Mother extends Family {
    void members() {
        System.out.println("Mother");
    }
}
class Father extends Family {
    void members() {
        System.out.println("Father");
    }
}
class Child extends Family {
    void members() {
        System.out.println("Child");
    }
}
public class singleinheritance {
    public static void main(String[] args) {
        Family f = new Family();
        f.members(); 
        Mother m = new Mother();
        m.members(); 
        Father fa = new Father();
        fa.members(); 
        Child c = new Child();
        c.members(); 
    }
}