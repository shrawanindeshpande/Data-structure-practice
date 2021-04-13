package dsa;
import java.util.*;
public class LinearSearch {
	
	public int search(int num,int array[]){
		for(int i=0;i<array.length;i++) {
			if(num==array[i]) {
				return i;
			}	
		}
		return -1;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		LinearSearch ls=new LinearSearch();
		int arr[];
		System.out.print("Enter number of elements:");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.printf("Enter %d elements:",n);
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element you want to search:");
		int num=sc.nextInt();
		if(ls.search(num,arr)==-1) {
			System.out.println(num+" is not present in array");
		}
		else {
			System.out.println(num+" is present at index "+
		ls.search(num,arr));
		}
		
		
		
	}
}
