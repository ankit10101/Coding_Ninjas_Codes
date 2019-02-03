/*
Merge Sort

Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.

Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)

Output format :
Array elements in increasing order (separated by space)

Constraints :
1 <= n <= 1000

Sample Input:
6 
2 6 8 5 4 3

Sample Output:
2 3 4 5 6 8
 */
package recursion2_lec;
import java.util.Scanner;
public class Merge_Sort {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void merge(int[] arr , int start ,int end) {
//		1st Approach using 2 extra arrays
//		int mid = (start + end) / 2;
//		int n1 = mid - start + 1; 
//		int n2 = end - mid; 
//		int L[] = new int [n1]; 
//		int R[] = new int [n2]; 
//		for (int i = 0; i < n1; ++i) 
//			L[i] = arr[start + i]; 
//		for (int j = 0; j < n2; ++j) 
//			R[j] = arr[mid + 1 + j]; 
//		int i = 0, j = 0; 
//		int k = start; 
//		while (i < n1 && j < n2) 
//		{ 
//			if (L[i] <= R[j]) 
//			{ 
//				arr[k] = L[i]; 
//				i++; 
//			} 
//			else
//			{ 
//				arr[k] = R[j]; 
//				j++; 
//			} 
//			k++; 
//		} 
//		while (i < n1) 
//		{ 
//			arr[k] = L[i]; 
//			i++; 
//			k++; 
//		} 
//		while (j < n2) 
//		{ 
//			arr[k] = R[j]; 
//			j++; 
//			k++; 
//		}
		// 2nd Approach using 1 extra array
		int mid = (start + end) / 2;
		int[] temp = new int[end - start + 1];
		int i = start;
		int j = mid + 1;
		int k = 0;
		while(i <= mid && j <= end) {
			if(arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			}else {
				temp[k++] = arr[j++];
			}
		}
		while(i <= mid) {
			temp[k++] = arr[i++];
		}
		while(j <= end) {
			temp[k++] = arr[j++];
		}
		for(i = 0;i < temp.length;i++) {
			arr[start + i] = temp[i];
		}
	}

	public static void mergeSort(int[] arr , int start, int end) {
		if(start >= end) {
			return;
		}
		int mid = (start + end) / 2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);
		merge(arr,start,end);
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		mergeSort(arr,0,arr.length - 1);
		print(arr);
	}
}
