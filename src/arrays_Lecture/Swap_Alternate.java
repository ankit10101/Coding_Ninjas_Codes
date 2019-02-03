/*
Swap Alternate

Given an array of length N, swap every pair of alternate elements in the array.
You don't need to print or return anything, just change in the input array itself.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces

Output Format :
Elements after swapping, separated by space.

Sample Input 1:
6
9 3 6 12 4 32

Sample Output 2 :
3 9 12 6 32 4

Sample Input 1:
9
9 3 6 12 4 32 5 11 19

Sample Output 2 :
3 9 12 6 32 4 11 5 19
 */
package arrays_Lecture;
import java.util.Scanner;
public class Swap_Alternate {
	
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
	
public static void swapAlternate(int[] arr){
      int i;
      for(i = 0; i < arr.length - 1;i = i + 2){
        int t = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = t;   
      }
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		swapAlternate(arr);
		printArray(arr);

	}

}
