/*
Array Equilibrium Index

Find and return the equilibrium index of an array. 
Equilibrium index of an array is an index i such that the sum of elements at indices less than i 
is equal to the sum of elements at indices greater than i.
Element at index i is not included in either part.
If more than one equilibrium index is present, you need to return the first one. 
And return -1 if no equilibrium index is present.

Input format :
Line 1 : Size of input array
Line 2 : Array elements (separated by space)

Sample Input:
7
-7 1 5 2 -4 3 0

Output:
3 
 */
package betterSolAndQuickSort;
import java.util.Scanner;
public class Array_Equilibrium_Index {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static int arrayEquilibrium(int[] arr){
		int sum = 0,i,leftSum = 0;
		for(i = 0;i < arr.length;i++) {
			sum += arr[i];
		}
		for (i = 0; i < arr.length;i++) { 
			sum -= arr[i]; 
			if (leftSum == sum) 
				return i; 
			leftSum += arr[i]; 
		} 
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.println(arrayEquilibrium(arr));
	}
}
