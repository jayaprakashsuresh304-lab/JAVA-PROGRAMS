import java.util.*;
public class factornum
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int no = sc.nextInt();
	    for (int i = 1;i<=40;i++ ) 
	    if (no%i==0){
	        System.out.println("factors is:"+i);
	    } 
}
}