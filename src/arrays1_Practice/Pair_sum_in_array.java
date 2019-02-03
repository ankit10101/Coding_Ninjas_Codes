/*
Pair sum in array

Given a random integer array A and a number x. Find and print the pair of elements in the array 
which sum to x.
Array A can contain duplicate elements.
While printing a pair, print the smaller element first.
That is, if a valid pair is (6, 5) print "5 6". 
There is no constraint that out of 5 pairs which have to be printed in 1st line. 
You can print pairs in any order, just be careful about the order of elements in a pair.

Input format :
Line 1 : Integer N (Array size)
Line 2 : Array elements (separated by space)
Line 3 : Integer x

Output format :
Line 1 : Pair 1 elements (separated by space)
Line 2 : Pair 2 elements (separated by space)
Line 3 : and so on

Constraints :
1 <= N <= 1000
1 <= x <= 100

Sample Input:
9
1 3 6 2 5 4 3 2 4
7

Sample Output :
1 6
3 4
3 4
2 5
2 5
3 4
3 4
 */
package arrays1_Practice;
import java.util.Scanner;
public class Pair_sum_in_array {
	
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
	
	public static void pairSum(int[] arr, int num){
		for(int i = 0;i < arr.length - 1;i++){
			for(int j = i + 1;j < arr.length;j++){
				if((arr[i] + arr[j])==num) {
					if(arr[i] < arr[j]) {
					System.out.print(arr[i] + " ");
					System.out.print(arr[j] + " ");
	                System.out.println();
					}
					else {
						System.out.print(arr[j] + " ");
						System.out.print(arr[i] + " ");
		                System.out.println();
						}	
				}
			}
			
		}
	}

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 int[] arr = takeInput();
	 int num = s.nextInt();
	 pairSum(arr, num);
	}

}
