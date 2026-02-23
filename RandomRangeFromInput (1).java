import java.util.Random;
import java.util.Scanner;

public class RandomRangeFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int startNumber = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int endNumber = scanner.nextInt();

        if (startNumber > endNumber) {
            System.out.println("Error: The starting number cannot be greater than the ending number.");
        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(endNumber - startNumber + 1) + startNumber;
            System.out.println("A random number between " + startNumber + " and " + endNumber + " is: " + randomNumber);
        }

        scanner.close();
    }
}