import java.util.Scanner;
import java.util.Stack;

public class MaxSizeRectangle {
	int maxHist(int n,int m,int row[]) {
		Stack<Integer> s=new Stack<Integer>();
		int top;
		int max_area=0;
		int area=0;
		int i=0;
		while(i<m) {
			if(s.empty() || row[s.peek()]<=row[i] ) {
				s.push(i++);
			}
			else {
				top=row[s.peek()];
				s.pop();
				area=top*i;
				if(!s.empty()) {
					area=top * (i - s.peek() - 1);
					
				}
				max_area = Math.max(area, max_area);
			}
		}
		while(!s.empty()) {
			top=row[s.peek()];
			s.pop();
			area=top*i;
			if(!s.empty()) {
				area=top*(i-s.peek()-1);
			}
			max_area=Math.max(area, max_area);
		}
		return max_area;
	}
	int findMaxRect(int arr[][],int n, int m){
		int result=maxHist(n, m, arr[0]);
		for(int i=1;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i!=0 &&arr[i][j]!=0) {
						arr[i][j]=arr[i-1][j]+arr[i][j];
						
				}
			}
			result=Math.max(result, maxHist(n, m, arr[i]));
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in); 
		MaxSizeRectangle mr=new MaxSizeRectangle();
		System.out.println("Enter row and column:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		System.out.println("Enter matrix elements:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
			arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Area of maximum rectangle is "+mr.findMaxRect(arr, n, m));
	}

}
