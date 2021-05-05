import java.util.Scanner;

public class MejorityElements {
	int majorityElement(int a[], int size)
    {
        // your code here
    int max=0;
    int index=-1;
    for(int i=0;i<size;i++){
        int count=0;
        for(int j=0;j<size;j++){
            if(a[i]==a[j]){
                count++;                
            }
        }
        if(count>max){
            max=count;
            index=i;
        }
        
    }
    if(max>size/2){
        return a[index];
    }
    return -1;
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
		MejorityElements me=new MejorityElements();
		System.out.println(me.majorityElement(arr, n));
		

	}

}
