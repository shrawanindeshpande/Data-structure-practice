import java.util.Scanner;

public class PalindromeCheck {
	boolean palindrome(String s) {
		int n=s.length();
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String str=sb.toString();
		if(s.equals(str)) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PalindromeCheck pc=new PalindromeCheck();
		System.out.println("Enter String:");
		String s=sc.next();
		if(pc.palindrome(s)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
