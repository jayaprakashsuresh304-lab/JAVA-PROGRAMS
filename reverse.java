  import java.util.*;
public class reverse{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int Codes=scan.nextInt();
        int reverse=0;
        while(Codes>0){
            int r=Codes%10;
            reverse=reverse*10+r;
            Codes=Codes/10;
        }
        System.out.println(reverse);
    }
}