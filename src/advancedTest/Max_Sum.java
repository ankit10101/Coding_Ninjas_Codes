package advancedTest;
import java.util.Scanner;
public class Max_Sum {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static int maxCrossingSum(int arr[], int l, int m, int r) 
	{ 
		int sum = 0; 
		int leftSum = Integer.MIN_VALUE; 
		for (int i = m; i >= l; i--) 
		{ 
			sum = sum + arr[i]; 
			if (sum > leftSum) 
				leftSum = sum; 
		} 
		sum = 0; 
		int rightSum = Integer.MIN_VALUE; 
		for (int i = m + 1; i <= r; i++) 
		{ 
			sum = sum + arr[i]; 
			if (sum > rightSum) 
				rightSum = sum; 
		} 
		return leftSum + rightSum; 
	} 
	public static int maxSubArraySum(int arr[], int l, int r) 
	{  
		if (l == r) 
			return arr[l];  
		int m = (l + r)/2; 
		return Math.max(Math.max(maxSubArraySum(arr, l, m),maxSubArraySum(arr, m+1, r)),maxCrossingSum(arr, l, m, r)); 
	} 

	public static void main(String[] args) {
		int arr[] = takeInput();
		int maxSum = maxSubArraySum(arr, 0, arr.length - 1);
		System.out.println(maxSum);
	}
}
