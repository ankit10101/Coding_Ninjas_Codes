/*
Linear Search

Given a random integer array A and an element x. 
You need to search this element x in the given array using linear search. 
Return the index of element in the input.
Linear search means, we need to compare elements from the array A one by one with the element x, 
till we found the match or we reach the end of array. If match found, return its index, 
and if not return -1.
Indexing in the array starts from 0.

Input format :
Line 1 : Integer n, Array Size
Line 2 : Array elements (separated by space)
Line 3 : Element to be searched (i.e. x)

Constraints :
1 <= n <= 10^5

Sample Input 1:
7
2 13 4 1 3 6 28
3

Sample Output 1:
4

Sample Input 2:
7
2 13 4 1 3 6 28
9

Sample Output 2:
-1
 */
package arrays_Lecture;
import java.util.Scanner;
public class Linear_Search {
	
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
	
	public static int linearSearch(int[] arr, int num){
      boolean flag = false;
      int i;
      for(i = 0;i < arr.length;i++){
        if(num == arr[i])
        {
          flag = true;
          break;
        }
      }
      
      if(flag == false)
        return -1;
      else 
        return i;	
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int[] arr = takeInput();
		int elem = s.nextInt();
		int result = linearSearch(arr,elem);
		System.out.print(result);	
	}

}
