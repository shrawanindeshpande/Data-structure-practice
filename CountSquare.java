import java.util.Scanner;

public class CountSquare {
	int countSquares(int N) {
        // code here
        int count=0;
        for(int i=1;i<N;i++){
            if(i*i<N){
               count++; 
            }
            
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int N=sc.nextInt();
		CountSquare sq=new CountSquare();
		System.out.println(sq.countSquares(N));

	}

}
