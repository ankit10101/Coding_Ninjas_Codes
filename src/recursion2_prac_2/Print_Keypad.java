/*
Print Keypad

Given an integer n, using phone keypad find out and print all the possible strings that can be 
made using digits of input n.

Note : The order of strings are not important. Just print different strings in new lines.

Input Format :
Integer n

Output Format :
All possible strings in different lines

Constraints :
1 <= n <= 10^6

Sample Input:
23

Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf
 */
package recursion2_prac_2;
import java.util.Scanner;
public class Print_Keypad {
	
	public static String[] returnKeys(int n) {
		if(n == 2) {
			return new String[] {"a","b","c"};
		}
		else if(n == 3) {
			return new String[] {"d","e","f"};
		}
		else if(n == 4) {
			return new String[] {"g","h","i"};
		}
		else if(n == 5) {
			return new String[] {"j","k","l"};
		}
		else if(n == 6) {
			return new String[] {"m","n","o"};
		}
		else if(n == 7) {
			return new String[] {"p","q","r","s"};
		}
		else if(n == 8) {
			return new String[] {"t","u","v"};
		}
		else {
			return new String[] {"w","x","y","z"};
		}		
	}
	
	public static void printKeypad(int n, String[] outputSoFar){
	  if(n == 0) {
		  for(String val:outputSoFar) {
			  System.out.println(val);
		  }
		  return;
	  }
		  String[] currentNumberCombinations = returnKeys(n % 10);
		  String[] newOutputSoFar = new String[currentNumberCombinations.length * outputSoFar.length];
		  int k = 0;
		  for(String s1:currentNumberCombinations) {
			  for(String s2:outputSoFar) {
				  newOutputSoFar[k++] = s1 + s2;
			  }
		  }
		  printKeypad(n/10, newOutputSoFar);
	  }

	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   printKeypad(s.nextInt(),new String[] {""});

	}

}
