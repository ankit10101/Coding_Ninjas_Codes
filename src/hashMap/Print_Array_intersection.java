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
package hashMap;
import java.util.HashMap;
import java.util.Scanner;
public class Print_Array_intersection {

	public static void intersection(int[] arr1, int[] arr2){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int key1 : arr1) {
			if(map.containsKey(key1)) {
				map.put(key1, map.get(key1) + 1);
			}else {
				map.put(key1,1);
			}
		}
		for(int key2 : arr2) {
			if(map.containsKey(key2) && map.get(key2) > 0) {
				System.out.print(key2 + " ");
				map.put(key2,map.get(key2) - 1);
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
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		intersection(arr1, arr2);
	}
}
