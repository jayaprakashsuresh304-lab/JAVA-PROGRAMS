import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);   
        int search = sc.nextInt();
        int start = 0, end = size - 1;
        boolean f = false;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == search) {
                System.out.println(mid +" "+"Found");
                f = true;
                break;
            } 
            else if (search > arr[mid]) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        if (f==false) {
            System.out.println("No Data");
        }
    }
}
