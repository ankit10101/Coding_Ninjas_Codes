/*
Return subsequences of String

Given a string (lets say of length n), return all the subsequences of the given string.
Subsequences contain all the strings of length varying from 0 to n. 
But the order of characters should remain same as in the input string.

Note : The order of subsequences are not important.

Sample Input:
abc

Sample Output:
"" (the double quotes just signifies an empty string, don't worry about the quotes)
c 
b 
bc 
a 
ac 
ab 
abc 
 */
package recursion2_prac_1;
import java.util.Scanner;
public class Return_subsequences_of_String {
	
	public static String[] subsequence(String input){
		if(input.length() == 0) {
			String[] rv = {""};
			return rv;
		}
		// Wrap the code except (base case) in else to increase readabilty
		else {
		String[] restSubSequences = subsequence(input.substring(1));
		String[] totalSubSequences = new String[restSubSequences.length * 2];
		int i,j = 0;
		for(i = 0;i < restSubSequences.length ;i++) {
			totalSubSequences[i] = restSubSequences[i];
		}
		for(;i < totalSubSequences.length;i++,j++) {
			totalSubSequences[i] = input.charAt(0) + restSubSequences[j]; 
		}
		return totalSubSequences;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String[] res = subsequence(input);
		for(String val:res) {
			System.out.println(val);
		}
	}
}
