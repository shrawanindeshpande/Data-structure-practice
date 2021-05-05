import java.util.Scanner;

public class SearchRowCol {
	boolean search(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	    for(int i=0;i<n;i++){
	         for(int j=0;j<m;j++){
	             if(matrix[i][j]==x){
	                 return true;
	             }
	         }
	    }
	    return false;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows:");
		int r=sc.nextInt();
		System.out.println("enter number of columns:");
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("enter array elements:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
			arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter number:");
		int x=sc.nextInt();
		SearchRowCol src=new SearchRowCol();
		if(src.search(arr, r, c, x)) {
			System.out.println(x+" is present in array");
		}
		else {
			System.out.println(x+" is not present in array");
		}

	}

}
