package dsa;
public class NbyKthNode {
	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int data){
			next=null;
			this.data=data;
		}
	}
	 public static int nknode(Node head,int n, int k)
	    {
	       Node n1=head;
	       int i=1;
	       int comp=n/k;
	       while(n1.next!=null) {
	    	   if(i==comp) {
	    		   return n1.data;
	    	   }
	    	   i++;
	    	   n1=n1.next;
	       }
	       return 0;
	    }
	 void display(){
			Node n1=head;
			while(n1.next!=null) {
				System.out.print(n1.data+"->");
				n1=n1.next;
			}
			System.out.print(n1.data);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NbyKthNode nkn=new NbyKthNode();
		nkn.head=new Node(1);
		nkn.head.next=new Node(2);
		nkn.head.next.next=new Node(5);
		nkn.head.next.next.next=new Node(9);
		nkn.head.next.next.next.next=new Node(20);
		int n=5;
		int k=2;
		nkn.display();
		System.out.printf("/n %d divided by %d th element is %d",n,k,nkn.nknode(head, n, k));
		

	}

}
