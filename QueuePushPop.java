package dsa;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;
public class QueuePushPop {
	 public Queue<Integer> push(int arr[], int n)
	    {
	        Queue<Integer> q=new LinkedList<Integer>();
	        int i=0;
	        while(i<n){
	           q.add(arr[i]); 
	           i++;
	        }
	        return q;
	    }
	    
	    public void _pop(Queue<Integer> q)
	    {
	        //dequeue the elements and print them
	        @SuppressWarnings("rawtypes")
			Iterator i=q.iterator();
	        while(i.hasNext()){
	            System.out.print(i.next()+" ");
	        }
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueuePushPop qpp=new QueuePushPop();
		int arr[]= {12,90,67,38,34};
		int n=arr.length;
		Queue<Integer> q=qpp.push(arr, n);
		qpp._pop(q);
	}
}
