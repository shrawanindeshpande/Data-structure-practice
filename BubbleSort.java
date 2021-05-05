import java.util.Scanner;

public class BubbleSort {
	void sort(int n, int arr[]) {
		int i,j,temp;
		boolean swap;
		for(i=0;i<n-1;i++) {
			swap=false;
			for(j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(swap==false) {
				break;
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
		BubbleSort ss=new BubbleSort();
		ss.sort(n,arr);
		System.out.println("Sorted array:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
