import java.util.Scanner;

public class SingleSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        System.out.print("Enter split position (n): ");
        int n = sc.nextInt();

        if (n > 0 && n < word.length()) {
            String part1 = word.substring(0, n);
            String part2 = word.substring(n);
            System.out.println("Result: " + part1 + " " + part2);
        } else {
            System.out.println("Invalid split position!");
        }

        sc.close();
    }
}
