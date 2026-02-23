import java.util.*;
public class count
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int no = sc.nextInt();
	    int count=0;
	    for (int i = 2;i<=no/2;i++ ){ 
	    if (no%i==0){
	        count++;
	    } 
}
System.out.println(count);
}
}