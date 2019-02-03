/*
Arrange Numbers in Array

Given a number n, put all elements from 1 to n in an array in order - 1,3,.......4,2.

Input Format :
Integer n

Output Format :
Elements of the array separated by space.

Sample Input 1 :
6

Sample Output 1 :
 1 3 5 6 4 2

Sample Input 2 :
9

Sample Output 2 :
 1 3 5 7 9 8 6 4 2
 */
package arrays_Lecture;
import java.util.Scanner;
public class Arrange_Numbers_in_Array {
	
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
	
public static int[] arrange(int n){	
      int i = 0,j = n-1,c = 1;
      int[] arr = new int[n]; 
      for(c = 1; c <= n ;c++){
        if(c % 2 != 0) {
        arr[i] = c;
        i++;
        }
        else {
        arr[j] = c;
        j--;}
      }
      return arr;

	}

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int[] arr = arrange(n);
	printArray(arr);

	}

}
