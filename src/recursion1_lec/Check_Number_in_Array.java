/*
Check Number in Array

Given an array of length N and an integer x, you need to find if x is present in the array or not. 
Return true or false.
Do this recursively.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
true or false

Constraints :
1 <= N <= 10^3

Sample Input :
3
9 8 10
8

Sample Output :
true

 */
package recursion1_lec;
import java.util.Scanner;
public class Check_Number_in_Array {
	
	 public static boolean checkElement(int[] arr,int elem , int startIndex){
	      if(startIndex == arr.length){
	        return false;
	      }
	      if(arr[startIndex] == elem)
	      return true;
	      else 
	      return checkElement(arr,elem ,startIndex + 1);
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
		 int startIndex = 0;
		 int x = s.nextInt();
	     boolean result = checkElement(input,x,startIndex);
	     System.out.println(result);

	}

}
