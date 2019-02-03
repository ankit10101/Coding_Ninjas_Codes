/*
Sort 0 1

You are given an integer array A that contains only integers 0 and 1.
Write a function to sort this array. Find a solution which scans the array only once. 
Don't use extra array.
You need to change in the given array itself. So no need to return or print anything.

Input format :
Line 1 : Integer N (Array Size)
Line 2 : Array elements (separated by space)

Output format :
Sorted array elements

Constraints :
1 <= N <= 10^6

Sample Input :
7
0 1 1 0 1 0 1

Sample Output :
0 0 0 1 1 1 1
 */
package arrays1_Practice;
import java.util.Scanner;
public class Sort_0_1 {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void printArray(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void sortBinaryArray(int[] arr){
		int c = 0,i;
		for(i = 0;i < arr.length;i++) {
			if(arr[i] == 0)
				c++;
		}
		for(i = 0; i < c;i++ ) {
			arr[i] = 0;
		}
		for(;i < arr.length;i++) {
			arr[i] = 1;
		}
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		sortBinaryArray(arr);
		printArray(arr);
	}
}
