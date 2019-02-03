/*
Print Subset Sum to K

Given an array A and an integer K, print all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. 
But the order of elements should remain same as in the input array.

Note : The order of subsets are not important. Just print them in different lines.

Input format :
Line 1 : Size of input array
Line 2 : Array elements separated by space
Line 3 : K 

Sample Input:
9 
5 12 3 17 1 18 15 3 17 
6

Sample Output:
3 3
5 1
 */
package recursion2_prac_2;
import java.util.Scanner;
public class Print_Subset_Sum_to_K {

	public static void printSubsetsSumTok(int input[], int k, int startIndex, int[] outputSoFar) {
		if(startIndex == input.length) {
			if(k == 0) {
				for(int i = 0;i < outputSoFar.length;i++) {
					System.out.print(outputSoFar[i] + " ");
				}
				System.out.println();
			}
			return;
		}
		int[] newOutputSoFar = new int[outputSoFar.length + 1];
		for(int i = 0;i < outputSoFar.length;i++) {
			newOutputSoFar[i] = outputSoFar[i];
		}
		newOutputSoFar[newOutputSoFar.length - 1] = input[startIndex];
		printSubsetsSumTok(input, k - input[startIndex], startIndex + 1, newOutputSoFar);
		printSubsetsSumTok(input, k, startIndex + 1, outputSoFar);
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] input = takeInput();	
		int k = s.nextInt();
		printSubsetsSumTok(input,k,0,new int[]{});
	}
}
