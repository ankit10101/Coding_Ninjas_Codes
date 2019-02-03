/*
Replace pi (recursive)

Given a string, compute recursively a new string where all appearances of "pi" have been replaced 
by "3.14".

Sample Input 1 :
xpix

Sample Output :
x3.14x

Sample Input 2 :
pipi

Sample Output :
3.143.14

Sample Input 3 :
pip

Sample Output :
3.14p
 */
package recursion1_prac_2;
import java.util.Scanner;
public class Replace_pi {
	
	public static String replace(String input){
		if(input.length() <= 1){
      return input;
    }
      String r = replace(input.substring(1));
     if(input.charAt(0) == 'p'){
       if(r.charAt(0) == 'i'){
         return "3.14" + r.substring(1);
       }
       else{
         return input.charAt(0) + r;
       }
     }
      else{
         return input.charAt(0) + r;
       } 
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(replace(s.nextLine()));
	}
}
