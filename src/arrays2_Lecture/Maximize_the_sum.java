/*
Maximize the sum

Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and
return the maximum sum.
That is, we can switch from one array to another array only at common elements.
If no intersection element is present, we need to take sum of all elements from the array with greater sum.

Input Format :
 Line 1 : An integer M i.e. size of first array
 Line 2 : M integers which are elements of first array, separated by spaces
 Line 3 : An integer N i.e. size of second array
 Line 4 : N integers which are elements of second array, separated by spaces

Output Format :
Maximum sum value

Constraints :
1 <= M, N <= 10^6

Sample Input :
6
1 5 10 15 20 25
5
2 4 5 9 15

Sample Output :
81

Sample Output Explanation :
We start from array 2 and take sum till 5 (sum = 11). Then we'll switch to array at element 10 and take till 15.
 So sum = 36. Now, no elements left in array after 15, so we'll continue in array 1. Hence sum is 81
 */
package arrays2_Lecture;
import java.util.Scanner;
public class Maximize_the_sum {
	
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
	
	public static long maximumSumPath(int[] arr1, int[] arr2) {
		        long sum = 0;
		        int i = 0,j = 0,sum1 = 0,sum2 = 0;
				while(i < arr1.length && j < arr2.length) {
					if(arr1[i] < arr2[j]) {
						sum1 += arr1[i];
			            i++;
					}
					else if(arr2[j] < arr1[i]) {
						sum2 += arr2[j];
			            j++;
					}
					else {
						if(sum1 < sum2) {
				               sum += sum2;	
							}
							else {
							   sum += sum1;
							}
						sum1 = 0;
						sum2 = 0;
						sum += arr1[i];
						i++;
						j++;
					}
				}
				 for(;i < arr1.length;i++)
						sum1 += arr1[i];
					for(;j < arr2.length;j++)
						sum2 += arr2[j];
				 if(sum1 > sum2)
					 sum += sum1;
				 else 
					 sum += sum2;
	return sum;
	}

	public static void main(String[] args) {
      int[] arr1 = takeInput();
      int[] arr2 = takeInput();
      long sum = maximumSumPath(arr1,arr2);
      System.out.print(sum);
	}

}
