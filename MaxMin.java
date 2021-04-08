//Find the maximum and minimum element in an array
import java.util.Scanner;
public class MaxMin {
	int[] arr;
	int size;
	int max;
	int min;
	Scanner sc=new Scanner(System.in);
	MaxMin(){
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		arr=new int[size];
		System.out.printf("Enter %d elements:",size);
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}	
	}
	//Function to find minimum
	int min() {
		min=arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;	
	}
	//function to find maximum
	int max() {
		max=arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxMin m=new MaxMin();
		System.out.println("Minimum number:"+m.min());
		System.out.println("Maximum number:"+m.max());
		
	}

}
