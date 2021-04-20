import java.util.Scanner;


public class KthMaxMin {
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	static int partition(int[] arr, int low, int high)
	{
	    int pivot = arr[high];
	    int i = (low - 1);
	 
	    for(int j = low; j <= high - 1; j++)
	    {
	        if (arr[j] < pivot)
	        {
	            i++;
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	static void quickSort(int[] arr, int low, int high)
	{
	    if (low < high)
	    {
	        int pi = partition(arr, low, high);
	 
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	}
	public int kthsmall(int arr[],int k) {
		return arr[k-1];
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of elements in an array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter k:");
		int k=sc.nextInt();
		KthMaxMin m=new KthMaxMin();
		m.quickSort(arr, 0, arr.length-1);
		
		System.out.println(m.kthsmall(arr, k));
	}

}
