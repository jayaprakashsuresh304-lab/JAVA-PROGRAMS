import java.util.*;
public class input{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        int Age = scan.nextInt();
        float Weight = scan.nextFloat();
        byte Point = scan.nextByte();
        double Score = scan.nextDouble();
        short Ratio = scan.nextShort();
        long Number2 = scan.nextLong();
        char value = scan.next().charAt(0);
        System.out.println(Name+" "+Age+" "+Weight+" "+Point+" "+Score+" "+Ratio+" "+Number2+" "+value+" ");
    }
}