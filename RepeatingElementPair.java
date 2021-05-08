package dsa;

import java.util.Scanner;

public class RepeatingElementPair {
	void RepeatPair(int arr[],int n) {
		int count[]=new int[n+1];
		for(int i=0;i<arr.length;i++) {
			if(count[arr[i]]==1) {
				System.out.print(arr[i]+" ");
			}
			count[arr[i]]++;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n:");
		int n=sc.nextInt();
		int arr[]=new int[n+2];
		System.out.println("enter array elements");
		for(int i=0;i<n+2;i++) {
			arr[i]=sc.nextInt();
		}
		RepeatingElementPair rp=new RepeatingElementPair();
		rp.RepeatPair(arr, n);
	}

}
