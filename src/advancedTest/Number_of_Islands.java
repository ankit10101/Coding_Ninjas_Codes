package advancedTest;
import java.util.Scanner;
public class Number_of_Islands {
	
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
		

	}

}
