/*
Return all codes

Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. 
You are given a numeric string S. 
Write a program to return the list of all possible codes that can be generated from the given string.

Note : The order of codes are not important.

Input format :
A numeric string

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
public class Return_codes {

	public static char getAlphabet(int n) {
		return (char)(96 + n);
	}

	public static  String[] getCode(String input){
		if(input.length() == 0) {
			return new String[] {""};
		}
		String firstNum = input.substring(0,1);
		int num1 = Integer.parseInt(firstNum);
		String[] rosCodes1 = getCode(input.substring(1));
		if(num1 == 0) {
			return rosCodes1;	
		}
		else {
			char alphabet1 = getAlphabet(num1);
			for(int i = 0;i < rosCodes1.length;i++) {
				rosCodes1[i] = alphabet1 + rosCodes1[i];
			}
		}
		if(input.length() >= 2) {
			String secondNum = input.substring(0,2);
			int num2 = Integer.parseInt(secondNum);
			if(num2 >= 10 && num2 <= 26) {
				String[] rosCodes2 = getCode(input.substring(2));
				char alphabet2 = getAlphabet(num2);
				for(int i = 0;i < rosCodes2.length;i++) {
					rosCodes2[i] = alphabet2 + rosCodes2[i];
				}

				String[] totalCodes = new String[rosCodes1.length + rosCodes2.length];
				int index = 0;
				for(int i = 0;i < rosCodes1.length;i++) {
					totalCodes[index++] = rosCodes1[i];
				}
				for(int i = 0;i < rosCodes2.length;i++) {
					totalCodes[index++] = rosCodes2[i];
				}
				return totalCodes;
			}
			else {
				return rosCodes1;
			}
		}
		else {
			return rosCodes1;
		}
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] result = getCode(s.next());
		for(String val:result) {
			System.out.println(val);
		}
	}
}
