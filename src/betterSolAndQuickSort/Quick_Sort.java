/*
Quick Sort

Sort an array A using Quick Sort.
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
package betterSolAndQuickSort;
import java.util.Scanner;
public class Quick_Sort {

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

	public static int partition(int[] arr, int start, int end) {
		int pivotElement = arr[start];
		int count = 0;
		for(int i = start;i <= end;i++) {
			if(arr[i] < pivotElement) {
				count++;
			}
		}
		int pivotIndex = count + start;
		arr[start] = arr[pivotIndex];
		arr[pivotIndex] = pivotElement;
		int i = start;
		int j = end;
		while(i < pivotIndex && j > pivotIndex) {
			if(arr[i] < pivotElement) {
				i++;
			}else if(arr[j] >= pivotElement) {
				j--;
			}else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
       return pivotIndex;
	}

	public static void quickSort(int[] arr, int start, int end) {
		if(start >= end) {
			return;
		}
		int pivotIndex = partition(arr,start,end);
		quickSort(arr,start,pivotIndex - 1);
		quickSort(arr,pivotIndex + 1,end);
	}



	public static void main(String[] args) {
		int[] arr = takeInput();
		quickSort(arr,0,arr.length - 1);
		print(arr);
	}
}
