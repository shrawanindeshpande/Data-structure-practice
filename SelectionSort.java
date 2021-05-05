import java.util.Scanner;

public class SelectionSort {
	void sort(int arr[],int n) {
		int min;
		int temp=0;
		for(int i=0;i<n;i++) {
			min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		SelectionSort ss=new SelectionSort();
		ss.sort(arr,n);
		System.out.println("Sorted array:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
