/*
Pair sum to 0

Given a random integer array A of size N. Find and print the pair of elements in the array 
which sum to 0.
Array A can contain duplicate elements.
While printing a pair, print the smaller element first.
That is, if a valid pair is (6, -6) print "-6 6". 
There is no constraint that out of the pairs which have to be printed in 1st line. 
You can print pairs in any order, just be careful about the order of elements in a pair.

Input format :
Line 1 : Integer N (Array size)
Line 2 : Array elements (separated by space)

Output format :
Line 1 : Pair 1 elements (separated by space)
Line 2 : Pair 2 elements (separated by space)
Line 3 : and so on

Constraints :
1 <= N <= 10^6
Ai contains all non-zero values

Sample Input:
5
2 1 -2 2 3

Sample Output :
-2 2
-2 2
 */
package hashMap;
import java.util.HashMap;
import java.util.Scanner;
public class Pair_sum_to_0 {

	public static void PairSum(int[] input, int size) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int key : input) {
			if(map.containsKey(key)) {
				map.put(key,map.get(key) + 1);
			}else {
				map.put(key,1);
			}
			if(map.containsKey(-key)) {
				int count = map.get(-key);
				for(int i = 0;i < count; i++) {
					if(key < -key) {
						System.out.println(key + " " + -key);
					}else {
						System.out.println(-key + " " + key);	
					}
				}
			}
		}
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < arr.length;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();	
		PairSum(arr, arr.length);
	}
}
