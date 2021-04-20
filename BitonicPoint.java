import java.util.Scanner;

public class BitonicPoint {
	int findMaximum(int[] arr, int n) {
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		BitonicPoint bp=new BitonicPoint();
		System.out.println(bp.findMaximum(arr, n));
		
	}

}
