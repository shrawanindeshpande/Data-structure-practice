import java.util.Scanner;

public class InsertionSort {
	void sort(int n,int arr[]) {
		int temp;
		int key;
		for(int i=0;i<n;i++) {
			key=arr[i];
			for(int j=0;j<=i;j++) {
				if(key<arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					//System.out.print(arr[i]+" ");
				}
			}
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
		InsertionSort ss=new InsertionSort();
		ss.sort(n,arr);
		System.out.println("Sorted array:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
