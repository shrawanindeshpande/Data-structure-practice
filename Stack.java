package dsa;

public class Stack {
	int array[]=new int[10];
	int top=-1;
	int temp;
	public void push(int num) {
		if(isOverflow()==false) {
			top+=1;
			array[top]=num;
			System.out.println("Element pushed");
		}
		else {
			System.out.println("Stack overflow");
		}
	}
	public int pop() {
		if(isUnderflow()==false) {
			temp=array[top];
			top-=1;
			return temp;
		}
		else {
			System.out.println("Stack underflow");
			return 0;
		}
	}
	public int pick(int index) {
		return array[index-1];
	}
	
	public void show() {
		for(int i=0;i<=top;i++) {
			System.out.println(array[i]);
		}
	}
	boolean isOverflow() {
		if(top==array.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean isUnderflow() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	


}
