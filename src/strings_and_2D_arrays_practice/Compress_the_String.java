/*
Compress the String

Write a program to do basic string compression. For a character which is consecutively
repeated more than once, replace consecutive duplicate occurrences with the count 
of repetitions.
For e.g. if a String has 'x' repeated 5 times, replace this "xxxxx" with "x5".

Note : Consecutive count of every character in input string is less than equal to 9.

Input Format :
Input string S

Output Format :
Compressed string 

Sample Input:
aaabbccdsa

Sample Output:
a3b2c2dsa
 */
package strings_and_2D_arrays_practice;
import java.util.Scanner;
public class Compress_the_String {

public static String compress(String inputString) {
   int i,c = 1,j = 0;
   String result = "";
   for(i = 0;i < inputString.length() - 1;i++) {
	   if(inputString.charAt(i+1) == inputString.charAt(i)) {
		   c++;	   
	   }
	   else {
		   if(c != 1)
		   result = result + inputString.charAt(i) + c;
		   else
		   result = result + inputString.charAt(i);
           c = 1;
	   }
   }
   if(c != 1)
   result = result + inputString.charAt(i) + c;
   else
   result = result + inputString.charAt(i);   
   return result;
}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String result = compress(str);
		System.out.print(result);
	}
}
