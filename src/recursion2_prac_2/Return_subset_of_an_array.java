/*
Return subset of an array

Given an integer array (of length n), find and return all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. 
But the order of elements should remain same as in the input array.

Note : The order of subsets are not important.

Input format :
Line 1 : Size of array
Line 2 : Array elements (separated by space)

Sample Input:
3
15 20 12

Sample Output:
[] (this just represents an empty array, don't worry about the square brackets)
12 
20 
20 12 
15 
15 12 
15 20 
15 20 12 

 */
package recursion2_prac_2;
import java.util.Scanner;
public class Return_subset_of_an_array {
	
	 public static int[][] subSets(int input[], int startIndex) {
			if(startIndex == input.length){
	          int[][] retVal = {{}};
	          return retVal;
	        }
	        int[][] roaSubSets = subSets(input,startIndex + 1);
	        int[][] totalSubSets = new int[roaSubSets.length*2][];
	        int i=0,j;
	        for(;i < roaSubSets.length;i++){
	          totalSubSets[i] = new int[roaSubSets[i].length];
	          for(j = 0;j < roaSubSets[i].length;j++){
	             totalSubSets[i][j] = roaSubSets[i][j];
	          }
	        }
	        int k = 0;
	        for(;i <  totalSubSets.length;i++,k++){
	           totalSubSets[i] = new int[roaSubSets[k].length + 1];
	           totalSubSets[i][0] = input[startIndex];
	          for(j = 1;j < totalSubSets[i].length;j++ ){
	             totalSubSets[i][j] = roaSubSets[k][j - 1];
	          }
	        }
	        return totalSubSets;
		}
	 
	 public static int[] takeInput() {
		 Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         int[] input = new int[n];
         for(int i = 0;i < n;i++) {
       	  input[i] = s.nextInt();
         }
         return input;
	}

	public static void main(String[] args) {
		int[] input = takeInput(); 
		int startIndex = 0;
		int[][] res = subSets(input, startIndex);
		for(int[] val:res) {
			for(int val1:val) {
				System.out.print(val1 + " ");
			}
			System.out.println();
		}
	}
}
