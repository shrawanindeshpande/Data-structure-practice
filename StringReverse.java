package dsa;

import java.util.Scanner;

public class StringReverse {
	public void push(int num) {
		if(isOverflow()==false) {
			top+=1;
			array[top]=num;
			System.out.println("Element pushed");
		}
		else {
			System.out.println("Stack overflow");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str[]=new char[50];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		
		

	}

}
