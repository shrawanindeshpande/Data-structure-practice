import java.util.Scanner;

public class SumOfMatrix {
	int sumOfMatrix(int N, int M, int[][] Grid) {
        // code here
        int sum=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                sum+=Grid[i][j];
            }
        }
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfMatrix sm=new SumOfMatrix();
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
		
		System.out.println("Sum of elements in matrix: "+sm.sumOfMatrix(r, c, arr));

	}

}
