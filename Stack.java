import java.util.*;
class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		next=null;
	}
}

class Stack{
  Node top=null;
  
  void push(int data){
    Node newnode = new Node(data);
    if(top==null){
      top=newnode;
    }
    else{
      newnode.next=top;
      top=newnode;
    }
  }
  void pop(){
    if(top==null){
      System.out.println("Your stack is empty");
      return;
    }
    top=top.next;
  }
  void peek(){
    System.out.println(top.data);
  }
  boolean isEmpty(){
    return top==null;
  }
  void display(){
    Node temp = top;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
}


public class Main {
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
	}
}