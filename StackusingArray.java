
/*Stack using linkedlist
class Node {
	int data;
	Node next;
	Node(int data) {
		this.data=data;
		next=null;
	}
}
class Stack {
	Node top=null;

	void push(int data) {
		Node newnode = new Node(data);
		if(top==null) {
			top=newnode;
		}
		else {
			newnode.next=top;
			top=newnode;
		}
	}
	void pop() {
		if(top==null) {
			System.out.println("Your stack is empty");
			return;
		}
		top=top.next;

	}

	void peek() {
		System.out.println(top.data);
	}

	boolean isEmpty() {
	return	top==null;
	}
	void display() {
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
	}
}
public class Main
{
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		s.pop();
		s.display();
		s.peek();
		System.out.println(s.isEmpty());
	}
}


*/


// Stack using array




import java.util.*;


class Stack{
     int size = 6;
     int arr[] = new int[size];
     int top = -1;

    void push(int data){
        if(top == size - 1){
            System.out.println("Stack Overflow");
            return;
        }
        else{
        top++;
        arr[top] = data;
        }
    }

     void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + arr[top]);
        top--;
    }

     void peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Top element: "+ arr[top]);
    }

     void display(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack elements:");
        for(int i = top; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
public class Main{
   
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}