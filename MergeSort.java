import java.util.Scanner;

public class MergeSort {
	void merge(int arr[], int l, int m, int r)
    {
       
        int n1 = m - l + 1;
        int n2 = r - m;
        int larray[] = new int[n1];
        int rarray[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            larray[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            rarray[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (larray[i] <= rarray[j]) {
                arr[k] = larray[i];
                i++;
            }
            else {
                arr[k] = rarray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = larray[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[k] = rarray[j];
            j++;
            k++;
        }
    }
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		MergeSort ss=new MergeSort();
		ss.sort(arr, 0,n-1);
		System.out.println("Sorted array:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}


	}

}
