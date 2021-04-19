import java.util.Scanner;

public class CountZeros {
	int countZeroes(int[] arr, int n) {
        int count=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]==0){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array containing 0's and 1's:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		CountZeros cz=new CountZeros();
		System.out.println("Number of zero's in array:"+cz.countZeroes(arr, n));

	


	}

}
