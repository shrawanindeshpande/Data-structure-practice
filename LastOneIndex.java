package dsa;

import java.util.Scanner;

public class LastOneIndex {
	public int lastIndex( String s) {
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                return i;
            }
        }
        return -1;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String which contains 0's and 1's:");
		String s=sc.next();
		LastOneIndex li=new LastOneIndex();
		System.out.println(li.lastIndex(s));

	}

}
