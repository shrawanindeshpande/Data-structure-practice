import java.util.Scanner;

public class DifferKth {
    int search(int arr[], int n,int x, int k)
    {
        int i = 0;
         
        while (i < n) {
            if (arr[i] == x)
                return i;
 
            i = i + Math.max(1, Math.abs(arr[i] - x) / k);
        }
        return -1;
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
		System.out.println("enter number of elements:");
		int k=sc.nextInt();
		System.out.println("enter number of elements:");
		int x=sc.nextInt();
		DifferKth dk=new DifferKth();
		if(dk.search(arr, n, x, k)>-1) {
			System.out.println("element present at index "+dk.search(arr, n, x, k));
		}
		
		

	}

}
