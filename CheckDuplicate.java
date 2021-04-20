package dsa;

public class CheckDuplicate {
	int duplicate(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(i==j) {
					continue;
				}
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {12,34,12,6,7,22};
		CheckDuplicate cd=new CheckDuplicate();
		System.out.println(cd.duplicate(array));

	}

}
