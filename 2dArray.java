import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   // int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}}
	    int rsize = sc.nextInt();
	    int csize = sc.nextInt();
	    int arr[][]= new int [rsize][csize];
	    for (int i = 0;i<rsize ;i++ ){
	        for (int j = 0;j<csize ;j++ ){
	            arr[i][j]=sc.nextInt();
	        } 
	    } 
	    for (int i =0;i<rsize;i++ ){
	        for (int j = 0;j<csize ;j++ ){
	            System.out.print(arr[i][j] + " ");
	        } 
	        System.out.println();
	    } 
		
	}
}