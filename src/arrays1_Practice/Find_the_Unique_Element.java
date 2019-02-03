/*
Find the Unique Element

Given an integer array of size 2N + 1. In this given array, N numbers are present twice 
and one number is present only once in the array.
You need to find and return that number which is unique in the array.
Note : Given array will always contain odd number of elements.

Input format :
Line 1 : Array size i.e. 2N+1
Line 2 : Array elements (separated by space)

Output Format :
Unique element present in the array

Constraints :
1 <= N <= 10^6

Sample Input :
7
2 3 1 6 3 6 2

Sample Output :
1
 */
package arrays1_Practice;
import java.util.Scanner;
public class Find_the_Unique_Element {
	
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

	public static int findUnique(int[] arr){
      int j =arr[0];
      for(int i = 0;i < arr.length;i++){
        int c =0;
        j = arr[i];
        for(int k = 0;k < arr.length;k++){
          if(j == arr[k])
            c++;
        }
        if(c == 1)
          break;
      }
      return j;

	}
	public static void main(String[] args) {
	  int[] arr = takeInput();
	  int unique = findUnique(arr);
	  System.out.print(unique);

	}

}
