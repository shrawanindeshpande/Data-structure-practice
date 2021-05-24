package dsa;
import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;
public class QueueOperation {
     void insert(Queue<Integer> q, int k){
        q.add(k); 
    }
    int findFrequency(Queue<Integer> q, int k){
    	int count=0;
        Iterator i=q.iterator();
        while(i.hasNext()) {
        	if((Integer)i.next()==k) {
        		count++;
        	}
        }
        if(count==0) {
        	return -1;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<Integer>();
		QueueOperation qo=new QueueOperation();
		qo.insert(q, 1);
		qo.insert(q, 2);
		qo.insert(q, 3);
		qo.insert(q, 4);
		qo.insert(q, 5);
		qo.insert(q, 3);
		qo.insert(q, 2);
		qo.insert(q, 1);
		System.out.println("frequency of 1 is "+qo.findFrequency(q, 1));
		System.out.println("frequency of 2 is "+qo.findFrequency(q, 2));
		System.out.println("frequency of 10 is "+qo.findFrequency(q, 10));
		System.out.println("frequency of 9 is "+qo.findFrequency(q, 9));
	}

}
