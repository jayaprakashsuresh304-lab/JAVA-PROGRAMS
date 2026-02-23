import java.util.*;
public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (Character.isAlphabetic(ch)) {
            System.out.println("Alphabet");
        } 
        else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } 
        else {
            System.out.println("Special Character");
        }
    }
}