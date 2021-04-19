import java.util.Scanner;

public class MatrixSwap {
	void interchange(int r, int c, int arr[][])
	{
	    int temp;
	    // Your Code Here
	     for(int i=0; i<r; i++) { 
	        temp=arr[i][0];
	        arr[i][0]=arr[i][c-1];
	        arr[i][c-1]=temp;
	    }
	    
	    
	    // pritning elements
	    for(int i=0; i<r; i++) { 
	        for(int j=0; j<c; j++) {
	    	    System.out.printf("%d ", arr[i][j]);
	    	}
	        System.out.printf("\n");
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows:");
		int r=sc.nextInt();
		System.out.println("enter number of columns:");
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("enter array containing 0's and 1's:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
			arr[i][j]=sc.nextInt();
			}
		}
		MatrixSwap ms=new MatrixSwap();
		ms.interchange(r, c,arr);
				

	}

}
