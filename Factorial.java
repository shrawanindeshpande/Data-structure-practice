package dsa;

public class Factorial {
	int fact(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f=new Factorial();
		System.out.println(f.fact(5));
	}

}
