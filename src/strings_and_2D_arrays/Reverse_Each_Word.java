/*
Reverse Each Word

Given a string S, reverse each word of a string individually. For eg. if a string is "abc def", 
reversed string should be "cba fed".

Input Format :
String S

Output Format :
Updated string

Constraints :
1 <= Length of S <= 1000

Sample Input :
Welcome to Coding Ninjas

Sample Output:
emocleW ot gnidoC sajniN
 */
package strings_and_2D_arrays;
import java.util.Scanner;
public class Reverse_Each_Word {
	
	public static String reverseEachWord(String input) {
		String reverseWord = "",result = "";
		int start = 0,j,end;
		for(int i= 0;i < input.length();i++) {
			if(input.charAt(i) == ' ') {
				end = i - 1;
				reverseWord = "";
				for(j = end;j >= start;j--) {
					reverseWord += input.charAt(j);
				}
				start  = i + 1;
				result = result + reverseWord + " ";
			}
		}
			reverseWord = "";
			for(j = input.length() - 1;j >= start;j--) {
				reverseWord += input.charAt(j);
			}
			result = result + reverseWord + " ";		
		return result;
	}

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			String str1 = reverseEachWord(str);
			System.out.print(str1);
	}

}
