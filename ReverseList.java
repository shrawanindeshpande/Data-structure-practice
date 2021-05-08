
public class ReverseList {
	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int data){
			next=null;
			this.data=data;
		}
		
	}
	void display() {
		Node n1=head;
		while(n1.next!=null) {
			System.out.print(n1.data+"->");
			n1=n1.next;
		}
		System.out.print(n1.data);
	}
	Node reverse(Node node) {
		Node prev=null;
		Node curr=node;
		Node Next;
		while(curr!=null){
			Next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=Next;
		}
		node=prev;
		return node;
		
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseList rl=new ReverseList();
		rl.head=new Node(1);
		rl.head.next=new Node(2);
		rl.head.next.next=new Node(3);
		rl.head.next.next.next=new Node(4);
		System.out.println("Original linked list:");
		rl.display();
		head=rl.reverse(rl.head);
		System.out.println("\nReversed linked list:");
		rl.display();
		

	}

}
