import java.util.Scanner;

public class PairDifference {
	 public boolean findPair(int arr[], int size, int n)
	    {
	        //code here.
	        for(int i=0;i<size;i++){
	            for(int j=i+1;j<size;j++){
	                if(Math.abs(arr[i]-arr[j])==n){
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter number:");
		int n=sc.nextInt();
		PairDifference pd=new PairDifference();
		System.out.println(pd.findPair(arr, size, n));

	}

}
