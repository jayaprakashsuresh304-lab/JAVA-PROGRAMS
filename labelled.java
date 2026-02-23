import java.util.*;
public class labelled{
    public static void main(String[]args){
        outerloop:
        for(int i=1;i<=3;i++){
            innerloop:
            for(int j=1;j<=3;j++){
                if(i==2){
                    break outerloop;
                }
                else{
                    System.out.println(i+""+j);
                }
            }
            System.out.println();
        }
    }
}