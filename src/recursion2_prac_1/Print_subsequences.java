/*
Print Subsequences

Given a string (lets say of length n), print all the subsequences of the given string.
Subsequences contain all the strings of length varying from 0 to n. 
But the order of characters should remain same as in the input string.

Note : The order of subsequences are not important. Print every subsequence in new line.

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
public class Print_subsequences {
	
	 public static void printSubSequence(String str, String outputSoFar){
	      if(str.length() == 0){
	        System.out.println(outputSoFar);
	        return;
	      }
	      printSubSequence(str.substring(1),outputSoFar + str.charAt(0));
	      printSubSequence(str.substring(1),outputSoFar);
	    } 

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String outputSoFar = "";
		printSubSequence(input, outputSoFar);

	}

}
