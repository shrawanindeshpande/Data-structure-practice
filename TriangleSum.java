import java.util.Scanner;

public class TriangleSum {
	public void UpperLowerSum(int arr[][],int n,int m) {
		int upper_sum=0;
		int lower_sum=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<m;j++) {
				upper_sum+=arr[i][j]; 
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(j<=i) {
				lower_sum+=arr[i][j]; 
				}
			}
		}
		System.out.print(upper_sum+" "+lower_sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		TriangleSum ts=new TriangleSum();
		System.out.println("Enter row and column:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		System.out.println("Enter matrix elements:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
			arr[i][j]=sc.nextInt();
			}
		}
		ts.UpperLowerSum(arr, n, m);
	}

}
