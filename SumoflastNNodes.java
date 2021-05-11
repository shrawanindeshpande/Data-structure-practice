package dsa;
public class SumoflastNNodes {
	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int data){
			next=null;
			this.data=data;
		}
	}
	public int sum(Node head,int n, int k){
	      //write code here
	      Node n1=head;
	      int i=1;
	      int sum=0;
	      while(n1.next!=null){
	          if(i>n-k){
	              sum+=n1.data;
	          }
	          i++;
	          n1=n1.next;
	      }
	      sum+=n1.data;
	      return sum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumoflastNNodes sn=new SumoflastNNodes();
		sn.head=new Node(1);
		sn.head.next=new Node(2);
		sn.head.next.next=new Node(5);
		sn.head.next.next.next=new Node(9);
		sn.head.next.next.next.next=new Node(20);
		sn.head.next.next.next.next.next=new Node(7);
		sn.head.next.next.next.next.next.next=new Node(12);
		int n=7;
		int k=4;
		System.out.printf("/n sum of last %d elements is %d",k,sn.sum(head, n, k));

	}

}
