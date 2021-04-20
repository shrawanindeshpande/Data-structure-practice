import java.util.Scanner;

public class SwapArray {
	public void swapElements(int[] arr, int n)
    {
        int temp;
        for(int i=0;i<n-2;i++){
            temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
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
		SwapArray sa=new SwapArray();
		sa.swapElements(arr, n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");;
		}

	}

}
