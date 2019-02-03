/*
Return subsets sum to K

Given an array A of size n and an integer K, return all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. 
But the order of elements should remain same as in the input array.

Note : The order of subsets are not important.

Input format :
Line 1 : Integer n, Size of input array
Line 2 : Array elements separated by space
Line 3 : K 

Constraints :
1 <= n <= 20

Sample Input :
9 
5 12 3 17 1 18 15 3 17 
6

Sample Output :
3 3
5 1
 */
package recursion2_prac_2;
import java.util.Scanner;
public class Return_subsets_sum_to_K {
	
	 public static int[][] subsetsSumtoK(int input[], int k, int startIndex) {
		 if(startIndex == input.length) {
		 if(k == 0) {
			 return new int[1][0];
		 }
			 else
		     return new int[0][0];
		 }
			int[][] subsetWithElement = subsetsSumtoK(input, k - input[startIndex], startIndex + 1);
			int[][] subsetWithoutElement = subsetsSumtoK(input, k, startIndex + 1);
			int[][] totalSubsets = new int[subsetWithElement.length + subsetWithoutElement.length][];
			int index = 0;
			for(int i = 0;i < subsetWithoutElement.length;i++,index++) {
				totalSubsets[index] = new int[subsetWithoutElement[i].length];
				for(int j = 0;j < subsetWithoutElement[i].length;j++) {
					totalSubsets[index][j] = subsetWithoutElement[i][j];
				}
				totalSubsets[index] = subsetWithoutElement[i];
			}
			
			for(int i = 0;i < subsetWithElement.length;i++,index++) {
				totalSubsets[index] = new int[subsetWithElement[i].length + 1];
				totalSubsets[index][0] = input[startIndex];
				for(int j = 0;j < subsetWithElement[i].length;j++) {
					totalSubsets[index][j + 1] = subsetWithElement[i][j];
				}
			}
			return totalSubsets;
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
      int[][] result = subsetsSumtoK(input,s.nextInt(),0);
      for(int[] val:result) {
    	  for(int val1:val) {
    		  System.out.print(val1 + " ");
    	  }
    	  System.out.println();
      }
	}
}
