import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();   
        int[] arr = new int[size];   

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int maxEven = Integer.MIN_VALUE;
        int maxOdd = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] > maxEven) {
                    maxEven = arr[i];
                }
            } else {
                if (arr[i] > maxOdd) {
                    maxOdd = arr[i];
                }
            }
        }

        System.out.println("EvenMax " + maxEven);
        System.out.println("OddMax " + maxOdd);
    }
}
