/*
Duplicate in array

Given an array of integers of size n which contains numbers from 0 to n - 2. 
Each number is present at least once. That is, if n = 5, numbers from 0 to 3 is present in the 
given array at least once and one number is present twice. 
You need to find and return that duplicate number present in the array.
Assume, duplicate number is always present in the array.

Input format :
Line 1 : Size of input array
Line 2 : Array elements (separated by space)

Output Format :
Duplicate element

Constraints :
1 <= n <= 10^6

Sample Input:
9
0 7 2 5 4 7 1 3 6

Sample Output:
7
 */
package arrays1_Practice;
import java.util.Scanner;
import java.util.Arrays;
public class Duplicate_in_array {
	
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
	

	public static int duplicate(int[] arr){  
      Arrays.sort(arr);
      int i;
        for(i = 0;i < arr.length - 1 ;i++){
            if(arr[i] == arr[i + 1])
                break;
        }
        return arr[i];
	}

	public static void main(String[] args) {
	 int[] arr = takeInput();
	 int duplicate = duplicate(arr);
	 System.out.print(duplicate);
	}

}
