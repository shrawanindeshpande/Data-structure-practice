package dsa;

import java.util.Scanner;

public class CLosest {
	int[] printClosest(int arr[], int brr[], int n, int m, int x)
	{
	    // Complete the function
	    int close=0;
	    int result[]=new int[2];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            if(arr[i]+brr[j]>close && arr[i]+brr[j]<=x ){
	                close=arr[i]+brr[j];
	                result[0]=arr[i];
	                result[1]=brr[j];
	            }
	        }
	    }
	    return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}System.out.println("enter number of elements:");
		int m=sc.nextInt();
		int brr[]=new int[m];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			brr[i]=sc.nextInt();
		}
		System.out.println("enter a number:");
		int x=sc.nextInt();
		CLosest c=new CLosest();
		int result[]=c.printClosest(arr, brr, n, m, x);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
