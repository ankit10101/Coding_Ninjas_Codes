/*
First Index of Number

Given an array of length N and an integer x, you need to find and return the first index of 
integer x present in the array. 
Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
first index or -1

Constraints :
1 <= N <= 10^3

Sample Input :
4
9 8 10 8
8

Sample Output :
1
 */
package recursion1_lec;
import java.util.Scanner;
public class First_index_of_Number {
	
	  public static int  firstIndexOfElement(int[] arr,int x,int startIndex){
		     if(startIndex == arr.length){
		       return -1;
		     }
		     if(arr[startIndex] == x)
		       return startIndex;
		     else
		     return firstIndexOfElement(arr,x,startIndex + 1);     
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
	    System.out.println(firstIndexOfElement(input,x,startIndex));
	}
}
