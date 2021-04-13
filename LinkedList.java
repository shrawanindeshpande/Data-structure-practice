package dsa;

public class LinkedList {
	Node head;
	
	public void insert(int data) {
		Node node=new Node();
	    node.data=data;
	    node.next=null;
	    if(head==null) {
	    	head=node;
	    }
	    else {
	    	Node n=head;
	    	while(n.next!=null) {
	    		n=n.next;
	    	}
	    	n.next=node;
	    	
	    }
	}
	
	public void insertAtStart(int data) {
		Node node=new Node();
	    node.data=data;
	    node.next=head;
	    head=node;
	}
	
	public void insertAt(int index,int data) {
		Node node=new Node();
	    node.data=data;
	    node.next=head;
	    Node n=head;
	    if(index==0) {
	    	insertAtStart(data);
	    }
	    else {
	    for(int i=0;i<index-1;i++) {
	    	n=n.next;
	    }
	    node.next=n.next;
	    n.next=node;
	    }
	}
	
	public void deleteAt(int index) {
		Node n=head;
		Node n1=null;
		if(index==0) {
			head=head.next;
		}
		else {
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
		}
	}
	public void show() {
		Node node=head;
		while(node.next!=null){
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}

}
