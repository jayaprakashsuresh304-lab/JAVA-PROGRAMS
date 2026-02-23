import java.util.*;
class Node {
	int data;
	Node next;
	Node(int d) {
		data=d;
		next=null;
	}
}
class singlylinkedlist {
	int size=0;
	Node head=null;
	Node tail=null;
	void add(int data) {
		Node newnode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newnode;
		}
		else {
			tail.next=newnode;
			tail=newnode;
		}
	}
	 void deleteatbeg(){
	     if(head==null){
	         System.out.println("No element to delete");
	         return;
	     }
	     head=head.next;
	 }
		void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		singlylinkedlist s  = new singlylinkedlist();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.display();
// 		s.deleteatlast();
// 		s.display();
		s.deleteatbeg();
		s.display();
		
	}
}
		
		
		
		
		
		
		