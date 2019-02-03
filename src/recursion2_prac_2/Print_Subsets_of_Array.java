/*
Print Subsets of Array

Given an integer array (of length n), find and print all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. 
But the order of elements should remain same as in the input array.

Note : The order of subsets are not important. Just print the subsets in different lines.

Input format :
Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)

Constraints :
1 <= n <= 15

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

public class Print_Subsets_of_Array {
	
	  public static void printAllSubset(int input[],int startIndex,int[] outputSoFar) {
		     if(startIndex == input.length){
		       for(int val:outputSoFar){
		         System.out.print(val + " ");
		       }
		       System.out.println();
		       return;
		     }
		      int[] newOutputSoFar = new int[outputSoFar.length + 1];
		      for(int i = 0;i < outputSoFar.length;i++){
		         newOutputSoFar[i] = outputSoFar[i];
		      }
		      newOutputSoFar[newOutputSoFar.length - 1] = input[startIndex];
		      printAllSubset(input,startIndex + 1,outputSoFar);
		      printAllSubset(input,startIndex + 1,newOutputSoFar);
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
        printAllSubset(input,0,new int[]{});
	}

}
