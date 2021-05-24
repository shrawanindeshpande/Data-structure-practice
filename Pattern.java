package dsa;

import java.util.Scanner;

public class Pattern {
	
	void printPattern(int n,int m,boolean flag) {
		System.out.println(m+" ");
		if(flag==false && n==m) {
			return;
		}
		if(flag) {
			if(m-5>0) {
				printPattern(n, m-5, true);
			}
			else {
				printPattern(n, m-5, false);
			}
		}
		else {
			printPattern(n, m+5, false);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Pattern p=new Pattern();
		System.out.println("enter a number:");
		int n=sc.nextInt();
		p.printPattern(n, n, true);
		

	}

}
