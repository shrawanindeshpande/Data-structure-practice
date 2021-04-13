package dsa;

import java.util.Scanner;

public class QueueImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Queue s=new Queue();
		String cont="y";
		while(cont.equalsIgnoreCase("y")) {
			System.out.println("Select Operation:");
			System.out.print("1.Enqueue\n2.Dequeue\n3.Show elements\n4.exit\nYour Choice-->");
			int choice=sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.print("Enter Number:");
				int num=sc.nextInt();
				s.enqueue(num);
				break;
			}
			case 2:{
				s.dequeue();
				break;
			}
			case 3:{
				s.show();
				break;
			}
			case 4
			:{
				System.exit(0);
				break;
			
			}
			default:{
				System.out.println("Invalid Choice");
				break;
			}
			}
			System.out.println("Continue(y/n):");
			cont=sc.next();
		}

	}

}
