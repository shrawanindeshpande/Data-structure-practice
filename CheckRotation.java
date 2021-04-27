import java.util.Scanner;

public class CheckRotation {
	boolean RotationString(String str1,String str2) {
		String com=str1.concat(str1);
		if(com.contains(str2)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CheckRotation cr=new CheckRotation();
		System.out.println("Enter first string");
		String str1=sc.next();
		System.out.println("Enter second string");
		String str2=sc.next();
		System.out.println(cr.RotationString(str1, str2));

	}

}
