
package dsa;

public class Queue {
	 int array[]=new int[10];
	 int front=0;
	 int rear=0;
	 public void enqueue(int data) {
		 if(rear!=array.length-1) {
			 array[rear]=data;
			 System.out.println("element inserted");
			 rear++;
		 }
		 else {
			 System.out.println("Cannot insert element. Queue is full.");
		 }
		 
	 }
	 public void dequeue() {
		 if(front!=rear) {
		 int num=array[front];
		 front++;
		 System.out.printf("%d is removed from queue",num);
		 }
		 else {
			 System.out.printf("Queue is empty. Cannot remove element");
		 }
	 }
	 public void show() {
		 for(int i=front;i<rear;i++) {
			 System.out.println(""+array[i]);
		 }
		 
	 }
	 

}
