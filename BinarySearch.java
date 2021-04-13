package dsa;
import java.util.*;
public class BinarySearch {
	public int search(int array[],int num) {
		int l=0;
		
		int r=array.length-1;
		while(l<=r){
			int m=1+(r-1)/2;
			if(array[m]==num) {
				return m;
			}
			if(m<num){
				l=m+1;
			}
			else {
				r=m-1;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,12,34,44,52,66,89};
		Scanner sc=new Scanner(System.in);
		BinarySearch bs=new BinarySearch();
		System.out.println("Enter number you want to search");
		int num=sc.nextInt();
		int result=bs.search(array,num);
		if(result==-1) {
			System.out.println(num+" is not present in array");
		}
		else {
			System.out.println(num+" is present at index "+result);
		}

	}

}
