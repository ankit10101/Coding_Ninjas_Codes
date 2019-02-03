/*
Find the Difference

Given an array A with N elements, you need to find difference of sum of elements at
even indices (E) and sum of elements at odd indices(O).
Note : Array indexes start from 0.

Input Format :
  Line 1 : Size of the array i.e N
  Line 2 : N integers i.e. elements of the array separated by space

Output Format :
Difference i.e. E - O.  

Input Constraints :
1<=N<=10^6
1 <= Ai <= 10^4

Sample Input :
5
1 2 3 4 5

Sample Output :
3

Sample Output Explanation :
Sum of elements at even indices = 1 + 3 + 5 = 9
Sum of elements at odd indices = 2 + 4 = 6
So output is (9 - 6) i.e. 3.
 */
package arrays_Lecture;
import java.util.Scanner;
public class Find_the_Difference {
	
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
	
	public static int findDifference(int[] input){
	      int sumE = 0,sumO = 0;
	      for(int i = 0;i < input.length;i++){
	        if(i % 2 == 0)
	          sumE += input[i];
	        else 
	          sumO += input[i];
	      }
	      return sumE - sumO;
		}

	public static void main(String[] args) {
		int[] arr = takeInput();
		int difference = findDifference(arr);
		System.out.print(difference);

	}

}
