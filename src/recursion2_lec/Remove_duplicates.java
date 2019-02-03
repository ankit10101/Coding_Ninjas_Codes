/*
Remove Duplicates

Given a string S, remove consecutive duplicates from it recursively.

Input Format :
String S

Output Format :
Output string

Constraints :
1 <= Length of String S <= 10^3

Sample Input :
aabccba

Sample Output :
abcba
 */
package recursion2_lec;
import java.util.Scanner;
public class Remove_duplicates {
	
	public static String removeConsecutiveDuplicates(String s) {
		 if(s.length() < 2){
	       return s;
	     }
	     String r = removeConsecutiveDuplicates(s.substring(1));
	     if(s.charAt(0) == r.charAt(0)){
	       return r;
	     }
	      else{
	        return s.charAt(0) + r; 
	      }
		}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println(removeConsecutiveDuplicates(s.nextLine()));
	}
}
