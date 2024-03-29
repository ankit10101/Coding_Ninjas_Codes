/*
Remove character

Given a string and a character x. Write a function to remove all occurrences of x character from the given string.
Leave the string as it is, if the given character is not present in the string.

Input format :
Line 1 : Input string
Line 2 : Character x

Sample Input :
welcome to coding ninjas
o

Sample Output :
welcme t cding ninjas
 */
package strings_and_2D_arrays_practice;
import java.util.Scanner;
public class Remove_character {
	
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
	
	public static String removeAllOccurrencesOfChar(String input, char c) {
		String result = "";
		for(int i= 0;i < input.length();i++) {
			if(input.charAt(i) == c)
				continue;
			result += input.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String input = s.nextLine();
       char c = s.next().charAt(0);
       String result = removeAllOccurrencesOfChar(input,c);
       System.out.print(result);
	}

}
