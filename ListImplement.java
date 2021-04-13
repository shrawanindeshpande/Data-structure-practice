package dsa;

public class ListImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		
		list.insert(45);
		list.insert(23);
		list.insert(90);
		list.insert(11);
		
		list.insertAtStart(234);
		
		list.insertAt(3, 55);
		list.deleteAt(4);
		
		list.show();

	}

}
