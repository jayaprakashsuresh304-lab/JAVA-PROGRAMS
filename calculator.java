public class calculator{
	 static String myMethod(String name , int age) {
		return("Hello" + name + "! you are" + age + "years old.");
	 }
	 public static void main (String[] args) {
	     String userName = ("Prakash");
	     int Age = 20; 
	     String message = myMethod(userName , Age);
		   System.out.println(message); 
		}
}