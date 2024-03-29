/*
Row Wise Sum

Given a 2D integer array of size M*N, find and print the sum of ith row elements separated by space.

Input Format :
Line 1 : Two integers M and N (separated by space)
Next M lines : ith row elements (separated by space)

Output Format :
Sum of every ith row elements (separated by space)

Constraints :
1 <= M, N <= 10^3

Sample Input :
4 2
1 2
3 4
5 6
7 8

Sample Output :
3 7 11 15 
 */
package strings_and_2D_arrays;
import java.util.Scanner;
public class Row_Wise_Sum {
	
	public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i = 0;i < rows;i++) {
			for(int j= 0;j < cols;j++) {
	             arr[i][j] = s.nextInt();			
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
	int[][] arr =takeInput();
	 int rSum,i,j;
	 for(i = 0;i < arr.length;i++) {
		 rSum = 0;
		 for(j = 0;j < arr[i].length;j++) {
			 rSum += arr[i][j];
		 }
		 System.out.print(rSum + " ");
	 }
	}
}
