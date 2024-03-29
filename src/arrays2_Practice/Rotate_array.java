/*
Rotate array

Given a random integer array of size n, write a function that rotates the given array by d elements 
(towards left)
Change in the input array itself. 
You don't need to return or print elements.

Input format :
Line 1 : Integer n (Array Size)
Line 2 : Array elements (separated by space)
Line 3 : Integer d

Output Format :
Updated array elements (separated by space)

Constraints :
1 <= N <= 1000
1 <= d <= N

Sample Input :
7
1 2 3 4 5 6 7
2

Sample Output :
3 4 5 6 7 1 2
 */
package arrays2_Practice;
import java.util.Scanner;
public class Rotate_array {
	
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
	
	public static void rotate(int[] arr, int d) {
		int[] arr1 = new int[arr.length];
        int i;
		for(i= 0;i < arr.length;i++) {
			arr1[i] = arr[i];
		}
		for(i = 0;i < arr.length - d;i++) {
			arr[i] = arr1[i+d];
		}
		for(int j = i;j < arr.length;j++) {
			arr[j] = arr1[d - arr.length + j];
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = takeInput();
		int d = s.nextInt();
		rotate(arr,d);
		printArray(arr);
	}
}
