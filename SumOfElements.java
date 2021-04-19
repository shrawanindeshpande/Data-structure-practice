import java.util.Scanner;

public class SumOfElements {
	int sumElement(int arr[],int n)
	{
	   
	    int sum=0;
	    for(int i=0;i<n;i++){
	        sum+=arr[i];
	    }
	    return sum;
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
		SumOfElements se=new SumOfElements();
		System.out.println("sum od array elements: "+se.sumElement(arr, n));

	}

}
