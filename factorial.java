import java.util.*;
public class factorial
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int no = sc.nextInt();
	    int mul=1;
	    for (int i = 1;i<=no;i++){ 
	      mul=mul*i;
	    }
	    System.out.println(mul);
}
}