//Reverse the array
import java.util.*;
public class ArrayReverse {
	int[] arr;
	int temp;
	Scanner sc=new Scanner(System.in); 
	void array_reverse(int size){
		arr=new int[size];
		System.out.println("Enter "+size+" elements:");
		//input array
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//Reverse array
		for(int i=0;i<(size/2);i++) {
			temp=arr[i];
			arr[i]=arr[(size-1)-i];
			arr[(size-1)-i]=temp;
		}
		//display array
		System.out.println("Reversed array:");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}			
	}
public static void main(String args[]) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in); 
	ArrayReverse a=new ArrayReverse();
	System.out.println("Enter size of array:");
	int size=sc.nextInt();
	a.array_reverse(size);
}
}
