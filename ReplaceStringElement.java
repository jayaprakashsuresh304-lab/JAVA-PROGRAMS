import java.util.Scanner;
public class ReplaceStringElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        System.out.print("Enter the word to remove: ");
        String toRemove = sc.nextLine();
        System.out.print("Enter the new word to add: ");
        String toAdd = sc.nextLine();
        String output = input.replace(toRemove, toAdd);
        System.out.println("Updated string: " + output);
        sc.close();
    }
}

