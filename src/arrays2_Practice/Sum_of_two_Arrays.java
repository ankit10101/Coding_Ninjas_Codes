/*
Sum of two arrays

Two random integer arrays are given A1 and A2, in which numbers from 0 to 9 are present at every 
index (i.e. single digit integer is present at every index of both given arrays).
You need to find sum of both the input arrays (like we add two integers) and put the result in another
array i.e. output array (output arrays should also contain only single digits at every index).
The size A1 & A2 can be different.

Note : Output array size should be 1 more than the size of bigger array and 
place 0 at the 0th index if there is no carry. No need to print the elements of output array.

Input format :
Line 1 : Integer n1 (A1 Size)
Line 2 : A1 elements (separated by space)
Line 3 : Integer n2 (A2 Size)
Line 4 : A2 elements (separated by space)

Output Format :
Output array elements (separated by space)

Constraints :
1 <= n1, n2 <= 10^6

Sample Input 1:
3
6 2 4
3
7 5 6

Sample Output 1:
1 3 8 0

Sample Input 2:
3
8 5 2
2
1 3

Sample Output 2:
0 8 6 5
 */

package arrays2_Practice;
import java.util.Scanner;
public class Sum_of_two_Arrays {
	

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
	
	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
		 int carry = 0,k,i,j;
			int[] arr3;
			if(arr1.length > arr2.length) {
				 arr3 = new int[arr1.length + 1];
				 i = arr1.length - 1;
	             j = arr2.length - 1;
				 while(i >= 0 && j >= 0) {
						arr3[i + 1] = (arr1[i] + arr2[j] + carry) % 10;
						carry = (arr1[i] + arr2[j] + carry)/10;
						i--;
						j--;
			}
				 for(k = i+1;k > 0 && i >= 0;k--) {
					 arr3[k] = (arr1[i] + carry) % 10;
				     carry = (arr1[i] + carry) / 10;
	               i--;
				 } 
				 arr3[0] = carry;
			}
			else {
				 arr3 = new int[arr2.length + 1];
				 i = arr1.length - 1;
	             j = arr2.length - 1;
				 while(i >= 0 && j >= 0) {
						arr3[j + 1] = (arr1[i] + arr2[j] + carry) % 10;
						carry = (arr1[i] + arr2[j] + carry)/10;
						i--;
						j--;
			}
				 for(k = j+1;k > 0 && j >= 0;k--) {
					 arr3[k] = (arr2[j] + carry) % 10;
				     carry = (arr2[j] + carry) / 10;
	                 j--;
				 }
				 arr3[0] = carry;
		}
			return arr3;
	}

	public static void main(String[] args) {
	int[] arr1 = takeInput();
	int[] arr2 = takeInput();
	int[] arr3 = sumOfTwoArrays(arr1,arr2);
	printArray(arr3);

	}

}
