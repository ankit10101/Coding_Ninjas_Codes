/*
Binary Search (Recursive)

Given an integer sorted array (sorted in increasing order) and an element x, 
find the x in given array using binary search. Return the index of x.
Return -1 if x is not present in the given array.

Note : If given array size is even, take first mid.

Input format :
Line 1 : Array size
Line 2 : Array elements (separated by space)
Line 3 : x (element to be searched)

Sample Input :
6
2 3 4 5 6 8 
5 

Sample Output:
3 
 */
package recursion2_prac_1;
import java.util.Scanner;
public class Binary_search {
	
	  public static int BinarySearch(int[] input,int left,int right,int element){
          if(left > right){
            return -1;
          }
          int mid = (left + right) / 2;
          if(input[mid] == element){
            return mid;
          }
          else if(element < input[mid]){
            return BinarySearch(input,left,mid - 1,element);
          }else{
            return BinarySearch(input,mid + 1,right,element);
          }
        }
	  
	  public static int[] takeInput() {
			 Scanner s = new Scanner(System.in);
	         int n = s.nextInt();
	         int[] input = new int[n];
	         for(int i = 0;i < n;i++) {
	       	  input[i] = s.nextInt();
	         }
	         return input;
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] input = takeInput();
		int element = s.nextInt();
		int left = 0;
		int right = input.length - 1;
		System.out.println(BinarySearch(input, left, right, element));
	}
}
