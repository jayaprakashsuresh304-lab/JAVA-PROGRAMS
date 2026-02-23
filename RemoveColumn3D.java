import java.util.Scanner;
public class RemoveColumn3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3]; 

        System.out.println("Enter elements (3x3 matrix):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter column index to remove (0-2): ");
        int removeCol = sc.nextInt();

        System.out.println("Matrix after removing column " + removeCol + ":");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j != removeCol) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
