/*
Selection Sort

Given a random integer array. Sort this array using selection sort.
Change in the input array itself. You don't need to return or print elements.

Input format :
Line 1 : Array Size
Line 2 : Array elements (separated by space)

Sample Input 1:
7
2 13 4 1 3 6 28

Sample Output 1:
1 2 3 4 6 13 28

Sample Input 2:
5
9 3 6 2 0

Sample Output 2:
0 2 3 6 9
 */
package arrays2_Lecture;
import java.util.Scanner;
public class Selection_Sort {
	
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
	
	public static void selectionSort(int[] arr) {
		for(int i = 0;i < arr.length - 1;i++){
			int min = arr[i];
			int minIndex = i;
			for(int j = i + 1;j < arr.length;j++) {
				if(arr[j] < min)
				{
					min = arr[j];
					minIndex = j;
				}
			}
			if(minIndex != i)
			{
				int t = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = t;
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
        selectionSort(arr);
		printArray(arr);
	}
}
