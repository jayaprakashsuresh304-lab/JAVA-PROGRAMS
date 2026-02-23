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
	
	void deleteatlast(){
	    if(head==null){
	        System.out.println("No element to delete");
	        return;
	    }
	    Node temp=head;
	    while(temp.next!=tail){
	        temp=temp.next;
	    }
	    tail=temp;
	    tail.next=null;
	    
	}
	void deleteatbeg(){
	  if(head==null){
	    System.out.println("No element to delete");
	    return;
	  }
	  head = head.next;
	}
	void deleteatpos(int pos){
	  if(pos<=0 || pos>size){
	    System.out.println("please enter a valid pos");
	    return;
	  }
	  if(pos==1){
	    deleteatbeg();
	    return;
	  }
	  if(pos==size){
	    deleteatlast();
	    return;
	  }
	  Node temp = head;
	  for(int i=1; i<pos-1; i++){
	    temp=temp.next;
	  }
	  Node temp1=temp.next;
	  temp.next = temp1.next;
	  size--;
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
		s.deleteatlast();
		s.display();
		s.deleteatlast();
		s.display();
		
	}
}