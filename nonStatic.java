import java.util.*;
class Main {
    public void prime(int a) {
        int count=0;
        for (int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        Main n = new Main();
        n.prime(num);
        n.prime(num1);
    }
}