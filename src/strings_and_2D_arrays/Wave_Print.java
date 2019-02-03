/*
Wave Print

Given a two dimensional n*m array, print the array in a sine wave order. 
i.e. print the first column top to bottom, next column bottom to top and so on.

Note : Print the elements separated by space.

Input format :
Line 1 : Two integers n and m, No. of rows & No. of columns (separated by space)
Next n lines : ith row elements (separated by space)

Sample Input :
3 4
1  2  3  4 
5  6  7  8 
9 10 11 12

Sample Output :
1 5 9 10 6 2 3 7 11 12 8 4
 */
package strings_and_2D_arrays;
import java.util.Scanner;
public class Wave_Print {
	
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
	
	public static void wavePrint(int input[][]){
		for(int j = 0;j < input[0].length;j++) {
			if(j % 2 ==0) {
			for(int i= 0;i < input.length;i++) {
					System.out.print(input[i][j] + " ");
				}
			}else {
				for(int i = input.length - 1 ;i >= 0;i--) {
					System.out.print(input[i][j] + " ");
				}
				}
			}
		}
	
	public static void main(String[] args) {
		int[][] arr = takeInput();
		wavePrint(arr);

	}

}
