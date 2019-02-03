/*
Replace character
Given an input string S and two characters c1 and c2, you need to replace every occurrence
 of character c1 with character c2 in the given string.

Input Format :
Line 1 : Input String S
Line 2 : Character c1 and c2 (separated by space)

Output Format :
Updated string

Constraints :
1 <= Length of String S <= 10^6

Sample Input :
abacd
a x

Sample Output :
xbxcd
 */
package strings_and_2D_arrays;
import java.util.Scanner;
public class Replace_character {
	
	public static String replaceCharacter(String input, char c1, char c2) {
		String str = "";
		for(int i = 0;i < input.length();i++) {
			if(input.charAt(i) == c1) {
				str += c2;
			}else {
				str += input.charAt(i);
			}	
		}
		return str;
	}

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str = s.nextLine();
	char c1 = s.next().charAt(0);
	char c2 = s.next().charAt(0);
	String str2 = replaceCharacter(str,c1,c2);
	System.out.print(str2);
	}

}
