import java.util.Scanner;

public class Middle {
	int findMiddle(int A, int B, int C){
        //code here
        if((A>B && A<C) || (A<B && A>C)){
            return A;
        }
        else if((B>A && B<C) || (B<A && B>C)){
            return B;
        }
        else{
            return C;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 elements:");
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		Middle m=new Middle();
		
		System.out.println(m.findMiddle(A, B, C)+" is middle element");


	}

}
