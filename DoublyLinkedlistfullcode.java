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
	
		void deleteatlast() {
		if(head==null) {
			System.out.println("There is no element to delete");
			return;
		}

		if(head==tail) {
			head=tail=null;
			System.out.println("All data deleted");
		}
		else {
			tail=tail.prev;
			tail.next=null;
		}
		size--;
	}
	
	 void deleteatbeg(){
        	if(head==null) {
			System.out.println("There is no element to delete");
			return;
		}
			if(head==tail) {
			head=tail=null;
			System.out.println("All data deleted");
		}
		else{
		    head=head.next;
		    head.prev=null;
		}
		size--;
    }
    
	void deleteatpos(int pos){
	    if(pos<=0 || pos>size){
	        System.out.println("Invalid pos");
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
	    Node temp=head;
	    for(int i=1;i<pos-1;i++){
	        temp=temp.next;
	    }
	    Node temp1=temp.next;
	    temp.next=temp1.next;
	    temp.next.prev=temp;
	    size--;
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
		d.display();
		d.deleteatpos(3);
		d.deleteatpos(2);
		d.display();
	}
}


