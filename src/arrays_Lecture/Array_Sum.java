/*
Array Sum

Given an array of length N, you need to find and return the sum of all elements of the array.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces

Output Format :
Sum

Constraints :
1 <= N <= 10^6

Sample Input :
3
9 8 9

Sample Output :
26
 */
package arrays_Lecture;
import java.util.Scanner;
public class Array_Sum {
	
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
	
	public static int sum(int[] input){
		int sum = 0;
        for(int i = 0;i < input.length;i++){
          sum += input[i]; 
        } 
        return sum;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		int sum = sum(arr);
		System.out.print(sum);

	}

}
