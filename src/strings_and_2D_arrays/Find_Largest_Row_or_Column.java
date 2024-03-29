/*
Find Largest Row or Column

Given an NxM 2D array, you need to find out which row or column has largest sum (sum of its elements) 
overall amongst all rows and columns.

Input Format :
Line 1 : 2 integers N and M respectively, separated by space 
Line 2: Single line having N*M elements entered in row wise manner, each separated by space.

Output Format :
If row sum is maximum then - "row" row_num max_sum
If column sum is maximum then - "column" col_num max_sum

Note : If there are more than one rows/columns with maximum sum consider the row/column that comes first. 
And if ith row and jth column has same sum (which is largest), consider the ith row as answer.

Sample Input 1 :
2 2 
1 1 1 1

Sample Output 1 :
row 0 2

Sample Input 2 :
3 3
3 6 9 1 4 7 2 8 9

Sample Output 2 :
column 2 25
 */
package strings_and_2D_arrays;
import java.util.Scanner;
public class Find_Largest_Row_or_Column {
	
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

	public static int rowSum(int[][] arr,int row) {
		int rSum = 0;
			for(int j = 0;j < arr[row].length;j++) {
				rSum += arr[row][j]; 
			}
		return rSum;
	}
	
	public static int colSum(int[][] arr,int col) {
		int cSum = 0;
			for(int i = 0;i < arr.length;i++) {
				cSum += arr[i][col]; 
			}
		return cSum;
	}
	
	public static void findLargest(int input[][]){
		int maxSum = rowSum(input,0);
		String dim = "row";
		int index = 0;
		for(int i = 1;i < input.length;i++)
			if(maxSum < rowSum(input,i)) {
				maxSum = rowSum(input,i);
				dim = "";
				dim += "row";
				index = i;
			}
		
		for(int j = 0;j < input[0].length;j++)
			if(maxSum < colSum(input,j)) {
				maxSum = colSum(input,j);
				dim = "";
				dim += "column";
				index = j;
			}
	  System.out.print(dim + " " + index + " " + maxSum);
	}

	public static void main(String[] args) {
	int[][] arr = takeInput();	
	findLargest(arr);
	}

}
