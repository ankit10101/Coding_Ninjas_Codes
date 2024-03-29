/*
Binary Search

Given a sorted integer array (in ascending order) and an element x. 
You need to search this element x in the given input array using binary search. 
Return the index of element in the input.
Indexing starts from 0.
Return -1 if x is not present in the input array.

Input format :
Line 1 : Integer N, Array Size
Line 2 : Array elements (separated by space)
Line 3 : Element to be searched (i.e. x)

Output Format :
Index

Constraints :
1 <= N <= 10^6

Sample Input 1:
7
1 3 7 9 11 12 45
3

Sample Output 1:
1

Sample Input 2:
7
1 2 3 4 5 6 7
9

Sample Output 2:
-1
 */
package arrays2_Lecture;
import java.util.Scanner;
public class Binary_Search {
	
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
    public static int binarySearch(int[] arr,int elem) {
    	int index = -1;
    	int start = 0;
    	int end = arr.length - 1;
    	while(start <= end) {
    		int mid = (start + end) / 2;
    		if(elem == arr[mid])
    		{
    			index = mid;
    			break;
    			
    		}
    		else if(elem < arr[mid] ) {
    			end = mid - 1;
    		}
    		else
    			{
    			  start = mid + 1;
    			}
    	}
    	return index; 
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = takeInput();
		int elem = s.nextInt();
	    int index = binarySearch(arr,elem);
		binarySearch(arr,elem);
		System.out.print(index);
	}
}
