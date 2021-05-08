package dsa;

import java.util.Scanner;

public class SumZero {
	public boolean findTriplets(int arr[] , int n)
    {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i!=j && j!=k && k!=i && (arr[i]+arr[j]+arr[k])==0){
                        return true;
                    }
                }
            }
        }
        return false;
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
		SumZero sz=new SumZero();
		if(sz.findTriplets(arr, n)) {
			System.out.println("There is triplet with sum zero.");
		}
		else {
			System.out.println("There is no triplet with sum zero.");
		}

	}

}
