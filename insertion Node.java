class Node{
  int data;
  Node next;
}
public class Main{
  public static void main(String[] args){
    Node n1 = new Node();
    n1.data=10;
    Node n2 = new Node();
    n2.data=20;
    n1.next=n2;
    Node n3 = new Node();
    n3.data=30;
    n2.next=n3;
    System.out.println(n1.data+" "+n2.data+" "+n3.data);
    System.out.println(n1.data+" "+n1.next.data+" "+n1.next.next.data);
  }
}