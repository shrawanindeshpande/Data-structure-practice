package dsa;

public class CircularLinkedList {
	Node head;
	Node tail;
	
	public void insert(int data) {
		Node n1=new Node();
		n1.data=data;
		n1.next=null;
		if(head==null) {
			head=n1;
			tail=n1;
			n1.next=null;
		}
		else {
			tail.next=n1;
			n1=tail;
			tail.next=head;
	}
	}
	
	public void show() {
		Node n=head;
		if(head==null) {
			System.out.println("");
			}
		else {
		
		while(n.next!=head) {
			System.out.println(n.data);
			n=n.next;
		}
		}
		
	}
}
