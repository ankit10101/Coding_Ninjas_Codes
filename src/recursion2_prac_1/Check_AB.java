/*
Check AB

Suppose you have a string made up of only 'a' and 'b'. 
Write a recursive function that checks if the string was generated using the following rules:
a. The string begins with an 'a'
b. Each 'a' is followed by nothing or an 'a' or "bb"
c. Each "bb" is followed by nothing or an 'a'
If all the rules are followed by the given string, return true otherwise return false.

Sample Input:
abb

Sample Output:
true
 */
package recursion2_prac_1;
import java.util.Scanner;
public class Check_AB {
	
	public static boolean checkAB(String input) {
        if(input.length() == 0){
          return true;
        }
       if(input.length() == 1){
         if(input.charAt(0) == 'a')
         return true;
         else
         return false;
       }
       if(input.charAt(0) == 'a'){
         if(input.charAt(1) == 'b' && input.length() > 2 && input.charAt(2) == 'b')
           return checkAB(input.substring(3));
         else if(input.charAt(1) == 'a')
           return checkAB(input.substring(1));
         else 
           return false;
       }
      else 
         return false;
   }

	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println(checkAB(s.next()));
	}
}
