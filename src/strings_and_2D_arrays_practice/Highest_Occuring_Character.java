/*
Highest Occuring Character

Given a string, find and return the highest occurring character present in the given
string.
If there are 2 characters in the input string with same frequency, 
return the character which comes first.

Note : Assume all the characters in the given string are lowercase.

Sample Input 1:
abdefgbabfba

Sample Output 1:
b

Sample Input 2:
xy

Sample Output 2:
x
 */
package strings_and_2D_arrays_practice;
import java.util.Scanner;
public class Highest_Occuring_Character {

	public static char highestOccuringCharacter(String inputString) {
		int c1 = 0,c2 = 0,i,j;
		char maxChar = '\0';
		j = 0;
		while(j < inputString.length()) {
		i = 0;
		do {
			if(inputString.charAt(i) == inputString.charAt(j)) {
				c2++;
			}
			i++;
		}while(i < inputString.length());
		if(c2 > c1) {
			maxChar = inputString.charAt(j) ;
			c1 = c2;
		}
		c2 = 0;
		j++;
	}
		return maxChar;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inputString = s.nextLine();
		char result = highestOccuringCharacter(inputString);
        System.out.print(result);
	}

}
