/*
Last Index of Number

Given an array of length N and an integer x, you need to find and return the last index of integer 
x present in the array. 
Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, 
return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).

Do this recursively. Indexing in the array starts from 0.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
last index or -1

Constraints :
1 <= N <= 10^3

Sample Input :
4
9 8 10 8
8

Sample Output :
3
 */
package recursion1_lec;
import java.util.Scanner;
public class Last_index_of_Number {
	
	   public static int  lastIndexOfElement(int[] arr,int x,int startIndex){
	       if(startIndex == arr.length)
	         return -1;     
	       int index =  lastIndexOfElement(arr,x,startIndex + 1);
	       if(index == -1)
	       {
	         if(x == arr[startIndex])
	           return startIndex;
	         else 
	           return -1;
	       }
	       else
	         return index;  
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
	    System.out.println(lastIndexOfElement(input,x,startIndex));

	}

}
