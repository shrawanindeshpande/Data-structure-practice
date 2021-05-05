import java.util.Scanner;

public class MinDiffPair {
	public int minimum_difference(int[] nums)
    {
        int min=Math.abs(nums[0]-nums[1]);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])<min){
                    min=Math.abs(nums[i]-nums[j]);
                }
            }
            
        }
        return min;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		MinDiffPair mp=new MinDiffPair();
		System.out.println("min diffrence is "+mp.minimum_difference(arr));

	}

}
