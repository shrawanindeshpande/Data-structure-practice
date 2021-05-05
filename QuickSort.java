import java.util.Scanner;

public class QuickSort {
	void quickSort(int a[],int low,int high) {
		if(low<high) {
		int pivot=partition(a, low, high);
		quickSort(a, low, pivot-1);
		quickSort(a, pivot+1, high);
		}
	}
	int partition(int a[],int low,int high) {
		int pivot=a[low];
		int i=low;
		int j=high;
		
		while(i<j) {
			while(a[i]<pivot) {i++;}
			while(a[j]>pivot) {j--;}
			if(i<j) {
				swap(a,i,j);
			}
			
		}
		swap(a,j,low);
		return j;
	}
	void swap(int a[],int  index1 ,int  index2) {
		int temp;
		temp=a[index1];
		a[index1]=a[index2];
		a[index2]=temp;
		
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
		QuickSort ss=new QuickSort();
		ss.quickSort(arr, 0,n-1);
		System.out.println("Sorted array:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
