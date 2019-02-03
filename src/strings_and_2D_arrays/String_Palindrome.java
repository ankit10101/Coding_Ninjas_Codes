/*
String Palindrome

Given a String s, check it its palindrome. Return true if string is palindrome, else return false.
Palindrome strings are those, where string s and its reverse is exactly same.

Input Format :
 String S

Output Format :
"true" if S is palindrome, else "false"

Sample Input 1 :
abcdcba

Sample Output 1 :
true 
 */
package strings_and_2D_arrays;
import java.util.Scanner;
public class String_Palindrome {
	
	public static boolean checkPalindrome(String str){
		boolean isPalindrome = true;
		for(int i = 0,j = str.length() - 1;i < (str.length()/2);i++,j--){
		if(str.charAt(i) != str.charAt(j)){
		isPalindrome = false;
		break;
		}
		}
		return isPalindrome;
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean isPalindrome = checkPalindrome(str);
		System.out.print(isPalindrome);
		

	}

}
