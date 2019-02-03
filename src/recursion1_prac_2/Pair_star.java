/*
Pair star

Given a string, compute recursively a new string where identical chars that are adjacent in the 
original string are separated from each other by a "*".

Sample Input 1 :
hello

Sample Output 1:
hel*lo

Sample Input 2 :
xxyy

Sample Output 2:
x*xy*y

Sample Input 3 :
aaaa

Sample Output 3:
a*a*a*a
 */
package recursion1_prac_2;

import java.util.Scanner;

public class Pair_star {
	
	public static String addStars(String s) {
		if(s.length() <= 1){
          return s;
        }
       String r = addStars(s.substring(1));
       if(s.charAt(0) == r.charAt(0)){
         return s.charAt(0) + "*" + r;
       }
      else{
        return  s.charAt(0) + r;
      }
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(addStars(s.nextLine()));
	}
}
