import java.util.Scanner;

public class SplitConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter a word to concatenate: ");
        String addWord = sc.nextLine();

        String[] parts = sentence.split(" ");

        System.out.println("\nConcatenated words:");
        for (String part : parts) {
            System.out.println(part + addWord);
        }

        sc.close();
    }
}
