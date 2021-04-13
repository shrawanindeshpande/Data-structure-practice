package dsa;
import java.util.Scanner;
public class StackImplement {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		Stack s=new Stack();
		String cont="y";
		while(cont.equalsIgnoreCase("y")) {
			System.out.println("Select Operation:");
			System.out.print("1.Push\n2.Pop\n3.Show elements\n4.Pick\n5.exit\nYour Choice-->");
			int choice=sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.print("Enter Number:");
				int num=sc.nextInt();
				s.push(num);
				break;
			}
			case 2:{
				System.out.println(s.pop()+" is poped from stack");
				break;
			}
			case 3:{
				s.show();
				break;
			}
			case 4:{
				System.out.println("Enter index: ");
				int index=sc.nextInt();
				System.out.printf("element at %d : %d",index,s.pick(index));
				break;
			
			}
			case 5:{
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
		System.exit(0);

	}
}

