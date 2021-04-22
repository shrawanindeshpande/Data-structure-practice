import java.util.Scanner;

public class PairSum {
	int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in an array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a number");
		int k=sc.nextInt();
		PairSum ps=new PairSum();
		System.out.println("sum of "+ps.getPairsCount(arr, n, k)+" pairs is equal to "+k);

	}

}
