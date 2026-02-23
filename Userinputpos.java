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

	void addatbeg(int data) {
		Node newnode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
		}
	}

	void addatpos(int data,int pos) {
		if(pos<=0 || pos>size+1) {
			System.out.println("please enter a valid pos");
			return;
		}
		if(pos==1) {
			addatbeg(data);
			return;
		}
		if(pos==size+1) {
			add(data);
			return;
		}
		Node newnode = new Node(data);
		if(head==null) {
			head=tail=newnode;
		}
		else {
			Node temp=head;
			for(int i=1; i<pos-1; i++) {
				temp=temp.next;
			}
			newnode.next=temp.next;
			temp.next=newnode;
			size++;

		}
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
		boolean a= true;
	
	    while(a){
	   System.out.println("Enter 1- beg , 2-at pos 3-last 4-display 0-exit");
	        int val = sc.nextInt();
	        switch(val){
	            case 0 :
	                a=false;
	                break;
	            case 1:
	                s.addatbeg(sc.nextInt());
	                break;
	           case 2:
	               System.out.println("Enter data,position");
	               s.addatpos(sc.nextInt(),sc.nextInt());
	               break;
	           case 3 :
	               s.add(sc.nextInt());
	               break;
	           default:
	           s.display();
	        }     
	    }

	}
}