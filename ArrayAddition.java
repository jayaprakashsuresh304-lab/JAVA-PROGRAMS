import java.util.Scanner;
public class ArrayAdditionuser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        if (size1 != size2) {
            System.out.println("Error: Arrays must be of equal size to perform addition.");
        } else {
            int[] sumArray = new int[size1];
            for (int i = 0; i < size1; i++) {
                sumArray[i] = array1[i] + array2[i];
            }
            System.out.print("Sum of arrays: ");
            for (int value : sumArray) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}