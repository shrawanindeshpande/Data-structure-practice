package dsa;

public class Doubly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.insert(20);
		dll.insert(30);
		dll.insert(10);
		
		dll.insertAtStart(33);
		dll.insertAt(0, 100);
		//dll.deleteAt(2);
		//dll.deleteAtBeginning();
		//dll.deleteAtEnd();
		
		dll.show();
		dll.search(110);

	}

}
