import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < no; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
