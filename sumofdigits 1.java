import java.util.*;
public class sumofdigits{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum =0;
        while (a>0){
            int r = a%10;
            System.out.println(r);
            sum = sum+r;
            a=a/10;
        }
        
        System.out.println(sum);
    }
}