import java.util.Scanner;

public class MultiplySum {
	public int multiply (int arr[], int n) {
        //Complete the function
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<n/2;i++){
            leftsum+=arr[i];
        }
         for(int i=n/2;i<n;i++){
            rightsum+=arr[i];
        }
        return leftsum*rightsum;
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
		MultiplySum ms=new MultiplySum();
		System.out.println(ms.multiply(arr, n));

	}

}
