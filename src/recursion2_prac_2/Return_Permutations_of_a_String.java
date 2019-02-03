/*
Return Permutations of a String

Given a string, find and return all the possible permutations of the input string.

Note : The order of permutations are not important.

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
public class Return_Permutations_of_a_String {
	
	public static int fact(int n) {
		int fact = 1;
		for(int i = n;i >= 1;i--) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static String[] permutationOfString(String input){
	      if(input.length() == 1){
	        String[] retVal = {input};
	        return retVal;
	      }
	      String[] rop = permutationOfString(input.substring(1));
	      String[] tp = new String[fact(rop[0].length() + 1)];
	      int k = 0;
	      for(int i = 0;i < rop.length;i++){
	    	  String temp = rop[i];
	    	for(int j = 0;j <= temp.length();j++,k++) {
	    		tp[k] = temp.substring(0,j) + input.charAt(0) + temp.substring(j);
	    	}
	      }
			return tp;
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String[] result = permutationOfString(input);
		for(String val:result) {
			System.out.println(val);
		}
	}
}
