// Queue using linked list
class Node {
	int data;
	Node next;
	Node(int data) {
		this.data=data;
		next=null;
	}
}
class Queue {
	Node front=null;
	Node rear = null;
	void enqueue(int data) {
		Node newnode= new Node(data);
		if(front==null) {
			front=rear=newnode;
		}
		else {
			rear.next=newnode;
			rear=newnode;
		}
	}
	void dequeue() {
		if(front==null) {
			System.out.println("Queue underflow");
			return;
		}
		if(front==rear) {
			front=rear=null;
		}
		else {
			front=front.next;
		}

	}

	void peek() {
		if(front==null) {
			System.out.println("Queue underflow");
			return;
		}
		System.out.println(front.data);
	}
    boolean isEmpty() {
		return (front==null && rear==null);
	}
	void display() {
		if(front==null) {
			System.out.println("Queue underflow");
			return;
		}
		Node temp = front;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}


public class Main{
	public static void main(String[] args) {
		Queue s = new Queue();
		s.enqueue(10);
		s.enqueue(20);
		s.enqueue(30);
		s.enqueue(40);
		s.display();
		s.dequeue();
		s.display();
		s.peek();
		System.out.println(s.isEmpty());
	}
}

