/*
Print all Codes

Assume that the value of a = 1, b = 2, c = 3, ... , z = 26.You are given a numeric string S. 
Write a program to print the list of all possible codes that can be generated from the given string.

Note : The order of codes are not important. Just print them in different lines.

Input format : A numeric string

Sample Input:
1123

Sample Output:
aabc
kbc
alc
aaw
kw
 */
package recursion2_prac_2;
import java.util.Scanner;
public class Print_all_Codes {

	public static char getAlphabet(int n) {
		return (char)(96 + n);
	}

	public static void printAllPossibleCodes(String input, String outputSoFar) {
		if(input.length() == 0) {
			System.out.println(outputSoFar);
			return;
		}
		String firstNum = input.substring(0, 1);
		int num1 = Integer.parseInt(firstNum);
		if(num1 == 0) {
			printAllPossibleCodes(input.substring(1), outputSoFar);
		}
		else {
			char Alphabet1 = getAlphabet(num1);
			printAllPossibleCodes(input.substring(1),outputSoFar + Alphabet1);
		}
		if(input.length() >= 2) {
			String secondNum = input.substring(0,2);
			int num2 = Integer.parseInt(secondNum);
			if(num2 >= 10 && num2 <= 26) {
				char Alphabet2 = getAlphabet(num2);
				printAllPossibleCodes(input.substring(2),outputSoFar + Alphabet2);
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		printAllPossibleCodes(s.next(),"");

	}

}
