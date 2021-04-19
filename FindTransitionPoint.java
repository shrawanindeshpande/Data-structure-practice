import java.util.Scanner;

public class FindTransitionPoint {
	int transitionPoint(int arr[], int n) {
	    for(int i=0;i<n;i++){
	        if(arr[i]==1){
	            return i;
	        }      
	    }
	    return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,0,0,0,1,1,1};
		int n=arr.length;
		FindTransitionPoint fnp=new FindTransitionPoint();
		System.out.println("transition point:"+fnp.transitionPoint(arr, n));

	}

}
