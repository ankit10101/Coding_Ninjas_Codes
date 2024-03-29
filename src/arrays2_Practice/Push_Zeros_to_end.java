/*
Push Zeros to end

Given a random integer array, push all the zeros that are present to end of the array. 
The respective order of other elements should remain same.
Change in the input array itself. You don't need to return or print elements. 
Don't use extra array.

Note : You need to do this in one scan of array only.

Input format :
Line 1 : Integer N, Array Size
Line 2 : Array elements (separated by space)

Output Format :
Array elements (separated by space)

Constraints :
1 <= N <= 10^6

Sample Input 1:
7
2 0 4 1 3 0 28

Sample Output 1:
2 4 1 3 28 0 0

Sample Input 2:
5
0 3 0 2 0

Sample Output 2:
3 2 0 0 0
 */
package arrays2_Practice;
import java.util.Scanner;
public class Push_Zeros_to_end {
	
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
	
	public static void pushZerosAtEnd(int[] arr){
      int i,j;
      for(i = 0,j = 0;j < arr.length;j++) {
		if(arr[j] != 0){	
        arr[i] = arr[j];
        i++;
        }
      }
        for(int k = i;k < arr.length;k++)
          arr[k] = 0;
	}

	public static void main(String[] args) {
	int arr[] = takeInput();
	pushZerosAtEnd(arr);
	printArray(arr);

	}

}
