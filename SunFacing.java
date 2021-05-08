package dsa;

import java.util.Scanner;

public class SunFacing {
	int countBuildings(int h[], int n) {
        // code here
        int count=1;
        int curmax=h[0];
        
        for(int i=1;i<n;i++){
            if(h[i]>=curmax){
                count++;
                curmax=h[i];
            }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of buildings:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter heights of :"+n+" buildings.");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		SunFacing sf=new SunFacing();
		System.out.println(sf.countBuildings(arr, n));
	}

}
