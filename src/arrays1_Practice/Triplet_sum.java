/*
 Triplet sum

Given a random integer array and a number x.
Find and print the triplets of elements in the array which sum to x.
While printing a triplet, print the smallest element first.
That is, if a valid triplet is (6, 5, 10) print "5 6 10". 
There is no constraint that out of 5 triplets which have to be printed on 1st line. 
You can print triplets in any order, just be careful about the order of elements in a triplet.

Input format :
Line 1 : Integer N (Array Size)
Line 2 : Array elements (separated by space)
Line 3 : Integer x

Output format :
Line 1 : Triplet 1 elements (separated by space)
Line 2 : Triplet 3 elements (separated by space)
Line 3 : and so on

Constraints :
1 <= N <= 1000
1 <= x <= 100

Sample Input:
7
1 2 3 4 5 6 7 
12

Sample Output:
1 4 7
1 5 6
2 3 7
2 4 6
3 4 5
 */
package arrays1_Practice;
import java.util.Scanner;
import java.util.Arrays;
public class Triplet_sum {
	
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

	public static void FindTriplet(int[] arr, int x){
        Arrays.sort(arr);
        for(int i = 0;i < arr.length -2;i++){
            for(int j = i + 1;j < arr.length;j++){
              for(int k = j + 1;k < arr.length;k++){
                if((arr[i] + arr[j] + arr[k]) == x)
                 System.out.print(arr[i] + " " + arr[j] + " " + arr[k] + "\n");
              }
            }
          }
    	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 int[] arr = takeInput();
		 int num = s.nextInt();
		 FindTriplet(arr, num);
	}
}
