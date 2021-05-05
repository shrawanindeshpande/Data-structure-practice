package dsa;

public class CountInversion {
	static long inversionCount(int[] arr, long N)
    {
        // Your Code Here
        long count=0;
        for(int i=0;i<N-1;i++){
            for(int j=i;j<N;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 20, 6, 4, 5 };
		System.out.println("Number of inversions are "+ CountInversion.inversionCount(arr,arr.length));
	}

}
