/*
Remove X

Given a string, compute recursively a new string where all 'x' chars have been removed.

Sample Input 1 :
xaxb

Sample Output 1:
ab

Sample Input 2 :
abc

Sample Output 2:
abc

Sample Input 3 :
xx

Sample Output 3:
 */
package recursion1_prac_2;
import java.util.Scanner;
public class Remove_X {
	
	public static String removeX(String input){
		if(input.length() == 0){
          return "";
        }
      if(input.charAt(0) == 'x'){
        return removeX(input.substring(1));
      }
      else{
        return input.charAt(0) + removeX(input.substring(1));
      }
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(removeX(s.nextLine()));
	}
}
