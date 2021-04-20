import java.util.Scanner;

public class ExtraElement {
	public int findExtra(int a[], int b[], int n) {
        // add code here.
        for(int i=0;i<n;i++){
            if(a[i]!=b[i]){
                return i;                
            }
            if(i==b.length-1){
                return n-1;
            }
            
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements in 1st array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter 1st array elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter number of elements in 2nd array:");
		int n1=sc.nextInt();
		int b[]=new int[n1];
		System.out.println("enter 2nd array elements:");
		for(int i=0;i<n1;i++) {
			b[i]=sc.nextInt();
		}
		ExtraElement ee=new ExtraElement();
		System.out.println(ee.findExtra(a, b, n));

	}

}
