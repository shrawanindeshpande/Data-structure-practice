import java.util.Scanner;

public class ThreeWayPartitioning {
	void threeWayPartitioning(int arr[],int n,int lowval,int highval) {
		int start=0;
		int end=n-1;
		
		for(int i=0;i<=end;) {
			if(arr[i]<lowval) {
				int temp=arr[start];
				arr[start]=arr[i];
				arr[i]=temp;
				start++;
				i++;
			}
			else if(arr[i]>highval) {
				int temp=arr[end];
				arr[end]=arr[i];
				arr[i]=temp;
				end--;
			
			}
			else {
				i++;
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
		System.out.println("enter lowval:");
		int lowval=sc.nextInt();
		System.out.println("enter highval:");
		int highval=sc.nextInt();
		ThreeWayPartitioning tp=new ThreeWayPartitioning();
		tp.threeWayPartitioning(arr, n, lowval, highval);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
