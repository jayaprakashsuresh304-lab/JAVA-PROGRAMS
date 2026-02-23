import java.util.*;
public class Main {
    public static boolean prime(int a) {
        int count=0;
        for (int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else{
            return  false;
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        System.out.println(prime(num));
        System.out.println(prime(num1));
    }
}