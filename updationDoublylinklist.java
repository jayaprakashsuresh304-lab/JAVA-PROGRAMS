import java.util.*;
class Node {
	int data;
	Node prev;
	Node next;
	Node(int data) {
		this.data = data;
		prev=null;
		next=null;
	}
}

class Doublylinkedlist {
	Node head=null;
	Node tail=null;
	int size=0;

	void addatlast(int data) {
		Node newnode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newnode;
		}
		else {
			newnode.prev=tail;
			tail.next=newnode;
			tail=newnode;
		}

	}

	void search(int d) {
		if(head==null) {
			System.out.println("There is no data to search");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			if(temp.data==d) {
				System.out.println("Data found");
				return;
			}
			temp=temp.next;
		}
		System.out.println("There is no data");
	}
	void updation(int pos,int d) {
		if(pos<=0 || pos>size) {
			System.out.println("Invalid pos");
			return;
		}
		if(pos==1) {
			head.data=d;
			return;
		}
		if(pos==size) {
			tail.data=d;
			return;
		}
		Node temp = head;
		for(int i=1; i<pos; i++) {
			temp=temp.next;
		}
		temp.data=d;

	}
	
		void display() {
		Node temp = head;
		if(head==null) {
			System.out.println("There is no element to print");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();

	}
}
public class Main {
	public static void main(String[] args) {
		Doublylinkedlist d = new Doublylinkedlist();
		d.addatlast(10);
		d.addatlast(20);
		d.addatlast(30);
		d.addatlast(40);
// 		d.search(90);
		d.updation(2,200);
		d.display();
	}
}