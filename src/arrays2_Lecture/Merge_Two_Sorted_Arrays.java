/*
Merge Two Sorted Arrays

Given two sorted arrays of Size M and N respectively, 
merge them into a third array such that the third array is also sorted.

Input Format :
 Line 1 : Size of first array i.e. M
 Line 2 : M elements of first array separated by space
 Line 3 : Size of second array i.e. N
 Line 2 : N elements of second array separated by space

Output Format :
M + N integers i.e. elements of third sorted array separated by spaces.

Constraints :
1 <= M, N <= 10^6

Sample Input :
5
1 3 4 7 11
4
2 4 6 13

Sample Output :
1 2 3 4 4 6 7 11 13 
 */
package arrays2_Lecture;
import java.util.Scanner;
public class Merge_Two_Sorted_Arrays {
	
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
	
public static int[] merge(int arr1[], int arr2[]){
	    int i = 0,j = 0,k = 0;
		int[] arr3 = new int[arr1.length + arr2.length];
		while(i < arr1.length && j < arr2.length ) {
			if(arr1[i] <= arr2[j]) {
				arr3[k++] = arr1[i++];
			}
			else {
			   arr3[k++] = arr2[j++];
			   }
		    }
		for(;i < arr1.length;)
			arr3[k++] = arr1[i++];
		for(;j < arr2.length;)
			arr3[k++] = arr2[j++];	
		return arr3;
	}

	public static void main(String[] args) {
		int arr1[] = takeInput();
		int arr2[] = takeInput();
		int arr3[] = merge(arr1,arr2);
		printArray(arr3);
	}

}
