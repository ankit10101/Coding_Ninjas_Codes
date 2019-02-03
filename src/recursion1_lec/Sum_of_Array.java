/*
Sum of Array

Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces

Output Format :
Sum

Constraints :
1 <= N <= 10^3

Sample Input :
3
9 8 9

Sample Output :
26
 */
package recursion1_lec;
import java.util.Scanner;
public class Sum_of_Array {
	
	 public static int sumOfElements(int[] input,int startIndex){
	      if(startIndex == input.length)
	        return 0 ;       
	      int s = input[startIndex] + sumOfElements(input,startIndex + 1);
	      return s;
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
		  int [] input = takeInput();
		  int startIndex = 0;
	      int r = sumOfElements(input,startIndex);
	      System.out.println(r);
	}

}
