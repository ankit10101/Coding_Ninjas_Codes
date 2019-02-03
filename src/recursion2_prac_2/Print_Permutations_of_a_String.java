/*
Print Permutations of a String

Given a string, find and print all the possible permutations of the input string.

Note : The order of permutations are not important. Just print them in different lines.

Sample Input :
abc

Sample Output :
abc
acb
bac
bca
cab
cba
 */
package recursion2_prac_2;
import java.util.Scanner;
public class Print_Permutations_of_a_String {
	
	public static void permutations(String input){
		printPermutations(input,"");
	}
    public static void printPermutations(String input,String outputSoFar){
      if(input.length() == 0){
        System.out.println(outputSoFar);
        return;
      }
      for(int i = 0; i < input.length();i++){
        char ch = input.charAt(i);
        String toBePermuted = input.substring(0,i) + input.substring(i + 1);
         printPermutations(toBePermuted,outputSoFar + ch);
      }
    }

	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   printPermutations(s.next(),"");

	}

}
