/*
Print Array intersection

Given two random integer arrays, print their intersection. 
That is, print all the elements that are present in both the given arrays.
Input arrays can contain duplicate elements.

Note : Order of elements are not important

Input format :
Line 1 : Integer N, Array 1 Size
Line 2 : Array 1 elements (separated by space)
Line 3 : Integer M, Array 2 Size
Line 4 : Array 2 elements (separated by space)

Output format :
Print intersection elements in different lines

Constraints :
1 <= M, N <= 10^6

Sample Input 1 :
6
2 6 8 5 4 3
4
2 3 4 7 

Sample Output 1 :
2 
4 
3

Sample Input 2 :
4
2 6 1 2
5
1 2 3 4 2

Sample Output 2 :
2 
2
1
 */
package arrays1_Practice;
import java.util.Scanner;
import java.util.Arrays;
public class Print_Array_intersection {
	
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
	
	public static void intersection(int[] arr1, int[] arr2){
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      int i = 0,j = 0;
      while(i < arr1.length && j < arr2.length){
        if(arr1[i] < arr2[j]){
          i++;
        }
        else if(arr2[j] < arr1[i]){
         j++;          
        }
        else{
        System.out.println(arr1[i]);
          i++;
          j++;
        }
      }
	}

	public static void main(String[] args) {
     int[] arr1 = takeInput();
     int[] arr2 = takeInput();
     intersection(arr1,arr2);
	}
}
