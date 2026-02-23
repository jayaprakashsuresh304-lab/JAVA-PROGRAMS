import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        boolean indicates = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == search) {
                indicates = true;
                System.out.println((i+1) + " position");
                break;
            }
        }
        if (indicates==false) {
            System.out.println("No Position");
        }
    }
}
