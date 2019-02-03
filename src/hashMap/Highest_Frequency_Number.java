/*
Highest Frequency Number

You are given with an array of integers that contain numbers in random order. 
Write a program to find and return the number which occurs maximum times in the given input.
If more than one element occurs same number of times in the input, 
return the element which is present in the input first.
Best solution takes O(n) time.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces

Output Format :
Most frequent element

Constraints :
1 <= N <= 10^5

Sample Input 1 :
13
2 12 2 11 12 2 1 2 2 11 12 2 6 

Sample Output 1 :
2

Sample Input 2 :
3
1 4 5

Sample Output 2 :
1
 */
package hashMap;
import java.util.HashMap;
import java.util.Scanner;
public class Highest_Frequency_Number {

	public static int getMaxFrequemcyNumber(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int key : arr) {
			if(map.containsKey(key)) {
				map.put(key,map.get(key) + 1);
			}else {
				map.put(key,1);
			}
		}

		int maxCount = Integer.MIN_VALUE;
		int maxFrequencyNumber = Integer.MIN_VALUE;
		for(int key : arr) {
			if(map.get(key) > maxCount) {
				maxCount = map.get(key);
				maxFrequencyNumber = key;
			}
		}
		return maxFrequencyNumber;
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
		System.out.println(getMaxFrequemcyNumber(arr));
	}
}
