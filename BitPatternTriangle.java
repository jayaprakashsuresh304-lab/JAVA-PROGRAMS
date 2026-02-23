import java.util.Scanner;

public class BitPatternTriangle {
    public static void printBitPatternTriangle(int n) {
        String bits = Integer.toBinaryString(n);
        for (int i = 1; i <= bits.length(); i++) {
            System.out.println(bits.substring(bits.length() - i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        printBitPatternTriangle(n);
        scanner.close();
    }
}