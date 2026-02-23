import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int oddsum = 0;
        int evensum = 0;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                evensum = oddsum + arr[i];  
            } else {
                oddsum = evensum + arr[i];   
            }
        }

        System.out.println(evensum);
        System.out.println(oddsum);
    }
}