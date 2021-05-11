package dsa;

import dsa.SumoflastNNodes.Node;

public class NodeAtIndex {
	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int data){
			next=null;
			this.data=data;
		}
	}
	public static int getNth(Node node,int n, int ind)
    {
		Node n1=node;
		int i=1;
		while(n1.next!=null) {
			if(i==ind) {
				return n1.data;
			}
			i++;
			n1=n1.next;
		}
		
		if(i==ind) {
			return n1.data;
		}
		return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeAtIndex ni=new NodeAtIndex();
		ni.head=new Node(1);
		ni.head.next=new Node(2);
		ni.head.next.next=new Node(5);
		ni.head.next.next.next=new Node(9);
		ni.head.next.next.next.next=new Node(20);
		ni.head.next.next.next.next.next=new Node(7);
		ni.head.next.next.next.next.next.next=new Node(12);
		int n=7;
		int ind=5;
		System.out.printf("node at %d is %d",ind,ni.getNth(head, n, ind));

	}

}
