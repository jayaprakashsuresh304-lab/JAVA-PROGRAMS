class Node{
  int data;
  Node next;
  Node(int d){
    data=d;
    next=null;
  }
}
class singlylinkedlist{
  Node head=null;
  Node tail=null;
  void add(int data){
    Node newnode = new Node(data);
    if (head==null){
      head=tail=newnode;
    }
    else{
      tail.next=newnode;
      tail=newnode;
    }
  }
  void display(){
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
  }
}
public class Main{
  public static void main (String[] args) {
    singlylinkedlist s = new singlylinkedlist();
    s.add(100);
    s.display();
    s.add(200);
    s.display();
    s.add(300);
    s.display();
  }
}