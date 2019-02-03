/*
Check array rotation

Given an integer array, which is sorted (in increasing order) and 
has been rotated by some number k in clockwise direction. Find and return the k.

Input format :
Line 1 : Integer n (Array Size)
Line 2 : Array elements (separated by space)

Output Format :
Integer k

Constraints :
1 <= n <= 1000

Sample Input 1:
6
5 6 1 2 3 4

Sample Output 1:
2

Sample Input 2:
5
3 6 8 9 10

Sample Output 2:
0
 */
package arrays2_Practice;
import java.util.Scanner;
public class Check_array_rotation {

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
/*Since earlier it was a sorted index so minimum element will be at 0 index . So, index of minimum
  array after rotation will be the required rotation in clockwise direction*/
	public static int arrayRotateCheck(int[] arr){
		int min = arr[0],minIndex = 0,i;
		for(i = 1;i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static void main(String[] args) {
	int[] arr = takeInput();
	int rotation = arrayRotateCheck(arr);
	System.out.print(rotation);
	}

}
