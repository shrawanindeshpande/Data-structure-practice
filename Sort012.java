package dsa;

public class Sort012 {
	void sort(int arr[]) {
		int low=0;
		int high=arr.length-1;
		int mid=0;
		int temp=0;
		while(mid<=high) {
			switch (arr[mid]) {
			case 0: {
				temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
				break;
			}
			case 1:{
				mid++;
			}
			case 2:{
				temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
				break;
			}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,2,1,0,0,1,2};
		Sort012 s=new Sort012();
		s.sort(arr);
		

	}
	
}
