import java.util.Scanner;

public class CountZero {
	 int countZeros(int A[][], int N)
	    {
	        // Your code here
	        int count=0;
	        for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(A[i][j]==0) {
					count++;
					}
				}
	        }
			return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		CountZero cz=new CountZero();
		System.out.println("Enter row and column for nXn matrix:");
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		System.out.println("Enter matrix elements:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(cz.countZeros(arr, n));
	}

}
