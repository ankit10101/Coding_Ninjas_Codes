package lec8;
import java.util.Scanner;
public class Two_D_arrays_demo {
	
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
	
	public static void printArray(int[][] arr) {
		for(int i = 0;i < arr.length;i++) {
			for(int j= 0;j < arr[i].length;j++) {
	             System.out.print(arr[i][j] + " ");			
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = takeInput();
		printArray(arr);
		
	}

}
