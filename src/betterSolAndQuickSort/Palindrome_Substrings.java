/*
Palindrome Substrings

Given a string S, count and return the number of substrings of S that are palindrome.
Single length substrings are also palindromes. You just need to calculate the count, 
not the substrings.

Input Format :
String S

Output Format :
count of palindrome substrings

Constraints :
1 <= Length of S <= 1000

Sample Input :
aba

Sample Output :
4

 **Note : Here 4 corresponds to ("a","b","a","aba").
 */
package betterSolAndQuickSort;
import java.util.Scanner;
public class Palindrome_Substrings {
	/*  1st Method Time Complexity = O(n^3)
	 * For a string of length n ,there are approximately n^2 subStrings
	public static boolean isPalindrome(String str) {
		boolean isPalindrome = true;
		for(int i = 0,j = str.length() - 1;i < (str.length()/2);i++,j--){
			if(str.charAt(i) != str.charAt(j)){
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

	public static int countPalindromeSubstrings(String str) {
		int c = 0;
		for(int i = 0; i < str.length();i++) {
			for(int j = i+1 ;j <= str.length();j++) {
				if(isPalindrome(str.substring(i,j))) {
					c++;	
				}
			}
		}
		return c;
	}
	 */

	// 2nd Approach

	/* To count no of palindromes taking one character as mid character and then moving left 
	  and right and simultaneously counting number of palindromes.
	 */
	public static int countPalindromeSubstrings(String str) {
		int count = 0,i;
		for(i = 0;i < str.length();i++) {
			int mid = i;
			int left = mid - 1;
			int right = mid + 1;
			count++;
			while(left >= 0 && right <= str.length() - 1) {
				if(str.charAt(left) == str.charAt(right)) {
					count++;
					left--;
					right++;
				}else {
					break;
				}
			}
		}
		/* To count no of palindromes taking two characters as mid characters and then moving left 
		  and right and simultaneously counting number of palindromes.
		 */
		for(i = 0;i < str.length() - 1;i++) {
			int leftMid = i;
			int rightMid = i + 1;
			int left,right;
			if(str.charAt(leftMid) == str.charAt(rightMid)) {
				count++;
				left = leftMid - 1;
				right = rightMid + 1;
			}
			else {
				continue;
			}
			while(left >= 0 && right <= str.length() - 1) {
				if(str.charAt(left) == str.charAt(right)) {
					count++;
					left--;
					right++;
				}else {
					break;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(countPalindromeSubstrings(str));
	}
}
