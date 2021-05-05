import java.util.Scanner;

public class StartEnd {
	void find(int a[],int n,int x) {
		int start=0;
		int end=0;
		for(int i=0;i<n;i++) {
			if(a[i]==x) {
				start=i;
				while(a[i]==x) {
					end=i;
					i++;
				}
			}
			}
		System.out.println(start+" "+end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter x:");
		int x=sc.nextInt();
		StartEnd se =new StartEnd();
		se.find(arr, n, x);

	}

}
