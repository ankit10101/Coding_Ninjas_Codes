/*
All Indices of Number

Given an array of length N and an integer x, you need to find all the indexes where x is present 
in the input array. Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
indexes where x is present in the array (separated by space)

Constraints :
1 <= N <= 10^3

Sample Input :
5
9 8 10 8 8
8

Sample Output :
1 3 4
 */
package recursion1_lec;

import java.util.Scanner;

public class All_Indices_of_Number {

	 public static int[] allIndexes(int input[], int x,int startIndex){
	      if(startIndex == input.length){
	        int[] rv = new int[0];
	        return rv;
	      }
	      int[] roaIndex = allIndexes(input,x,startIndex + 1);
	      if(input[startIndex] == x){
	        int[] totalIndex = new int[(roaIndex.length) + 1];
	        totalIndex[0] = startIndex;
	        for(int i = 0;i < roaIndex.length;i++){
	          totalIndex[i+1] = roaIndex[i];
	        }
	        return totalIndex;
	      }
	      else{
	        return roaIndex;
	      }	      
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
		Scanner s = new Scanner(System.in);
		int[] input = takeInput();
		int x = s.nextInt();
		int startIndex = 0;
		int[] result = allIndexes(input,x,startIndex); 
        for(int val:result) {
        	System.out.print(val + " ");
        }
	}

}
