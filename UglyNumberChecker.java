import java.util.Scanner;
public class UglyNumberChecker {
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's ugly: ");
        int number = scanner.nextInt();
        scanner.close();
        if (isUgly(number)) {
            System.out.println(number + " is an ugly number.");
        } else {
            System.out.println(number + " is not an ugly number.");
        }
    }
}