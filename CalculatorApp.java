import java.util.Scanner;
class Calculation {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return (double) a / b;
    }
}
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculation calc = new Calculation();
        char choice;

        do {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Choose operation (+, -, *, /): ");
            char op = scanner.next().charAt(0);

            switch (op) {
                case '+':
                    System.out.println("Result: " + calc.add(num1, num2));
                    break;
                case '-':
                    System.out.println("Result: " + calc.subtract(num1, num2));
                    break;
                case '*':
                    System.out.println("Result: " + calc.multiply(num1, num2));
                    break;
                case '/':
                    try {
                        System.out.println("Result: " + calc.divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
            }

            System.out.print("Do you want to perform another calculation? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Calculator closed.");
    }
}