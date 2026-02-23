import java.util.*;
public class maxsecvalues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int firstMax = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > firstMax) {
                firstMax = arr[i];
            }
        }
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] > secondMax && arr[i] < firstMax) {
                secondMax = arr[i];
            }
        }
        System.out.println("The First Maximum value is: " + firstMax);
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No distinct Second Maximum value found.");
        } else {
            System.out.println("The Second Maximum value is: " + secondMax);
        }
    }
}