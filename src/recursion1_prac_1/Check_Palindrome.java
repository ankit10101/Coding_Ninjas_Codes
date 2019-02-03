/*
Check Palindrome (recursive)

Check if a given String S is palindrome or not (using recursion). Return true or false.

Input Format :
String S

Output Format :
true or false

Sample Input 1 :
racecar

Sample Output 1:
true

Sample Input 2 :
ninja

Sample Output 2:
false
 */
package recursion1_prac_1;
import java.util.Scanner;
public class Check_Palindrome {
	
	public static boolean isStringPalindrome(String input) {
		if(input.length() == 1){
          return true;
        }
      if(input.length() == 2){
        if(input.charAt(0) == input.charAt(1))
          return true;
        else
          return false;
      }
      if(input.charAt(0) == input.charAt(input.length()-1)){
        return  isStringPalindrome(input.substring(1,input.length() - 1));
      }
      else 
        return false;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(isStringPalindrome(s.nextLine()));

	}

}
