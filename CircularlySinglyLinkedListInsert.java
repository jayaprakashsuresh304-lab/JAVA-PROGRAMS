import java.util.*;
class Node {
	int data;
	Node prev;
	Node next;
	Node(int data) {
		this.data = data;
		prev=next=null;
	}
}

class CircularDoublylinkedlist {
	Node head = null;
	Node tail = null;
	int size=0;

	void addatlast(int data) {
		Node newnode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newnode;
			head.prev=tail;
			tail.next=head;
		}
		else {
			newnode.prev=tail;
			tail.next=newnode;
			tail=newnode;
			head.prev=tail;
			tail.next=head;
		}
	}

	void addatbeg(int data) {
		Node newnode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newnode;
			head.prev=tail;
			tail.next=head;
		}
		else{
		    head.prev=newnode;
		    newnode.next=head;
		    head=newnode;
		    head.prev=tail;
		    tail.next=head;
		}
	}

	void display() {
		if(head==null) {
			System.out.println("There is no element to print");
			return;
		}
		Node temp = tail;
		do {
			System.out.print(temp.data+" ");
			temp=temp.prev;
		} while(temp!=tail);
		System.out.println();
	}

}
public class Main {
	public static void main(String[] args) {
		CircularDoublylinkedlist c = new CircularDoublylinkedlist();
		c.addatlast(10);
		c.addatlast(20);
		c.addatlast(30);
		c.addatbeg(50);
		c.display();
	}
}









