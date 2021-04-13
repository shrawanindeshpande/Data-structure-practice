package dsa;

public class DoublyLinkedList {
	DoublyNode head;
	
	public void insert(int data) {
		DoublyNode dn=new DoublyNode();
		dn.data=data;
		dn.prev=null;
		dn.next=null;
		DoublyNode n=head;
		if(head==null) {
			head=dn;
		}
		else {
		while(n.next!=null) {
			n=n.next;
		}
		n.next=dn;
		dn.prev=n;
	}
	}
	
	public void insertAtStart(int data) {
		DoublyNode dn=new DoublyNode();
		dn.data=data;
		dn.next=head;
		head.prev=dn;
		head=dn;
		
	}
	public void insertAt(int index,int data) {
		DoublyNode dn=new DoublyNode();
		dn.data=data;
		dn.prev=null;
		dn.next=null;
		DoublyNode n=head;
		if(index==0) {
			insertAtStart(data);
		}
		else {
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			dn.prev=n;
			dn.next=n.next;
			n.next=dn;
		}
	}
	
	public void deleteAtBeginning() {
		DoublyNode n=head;
		head=head.next;
		head.prev=null;
	}
	
	public void deleteAt(int index) {
		DoublyNode n=head;
		DoublyNode n1=null;
		for(int i=0;i<index-1;i++) {
			n=n.next;
		}
		n1=n.next;
		n1.prev=n;
		n.next=n1.next;
		
	}
	
	public void deleteAtEnd() {
		DoublyNode n=head;
		while(n.next!=null){
			n=n.next;
		}
		n=n.prev;
		n.next=null;
	}
	
	public void search(int key) {
		DoublyNode n=head;
		while(n.next!=null){
			if(n.data==key) {
				System.out.println(key+" is present.");
				break;
			}
			n=n.next;
		}
		System.out.println(key+" is not present.");
	}
	public void show() {
		DoublyNode n=head;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	} 
}
