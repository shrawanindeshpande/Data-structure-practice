import java.util.Scanner;

public class ProductMaxMin {
	public long find_multiplication (int arr[], int brr[], int n, int m) {
        // Complete the Function
        int max=arr[1];
        int min=brr[1];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(min>brr[i]){
                min=brr[i];
            }
        }
        return max*min;
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
		
		System.out.println("enter number of elements:");
		int m=sc.nextInt();
		int brr[]=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++) {
			brr[i]=sc.nextInt();
		}
		ProductMaxMin pmm=new ProductMaxMin();
		System.out.println(pmm.find_multiplication(arr, brr, n, m));

	}

}
