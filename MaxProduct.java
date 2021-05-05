import java.util.Scanner;

public class MaxProduct {
	int maxProduct(int arr[], int n) {
        int maxpro=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]*arr[j])>maxpro){
                    maxpro=arr[i]*arr[j];
                }
            }
            
        }
        return maxpro;
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
		MaxProduct mp=new MaxProduct();
		System.out.println("max product "+mp.maxProduct(arr, size));

	}

}
