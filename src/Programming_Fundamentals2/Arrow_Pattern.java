/*
Arrow Pattern

Print the following pattern for the given number of rows.
Assume N is always odd.

Note : There is space after every star.

Pattern for N = 7
*
 * *
   * * *
     * * * *
   * * *
 * *
*

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Sample Input :
11

Sample Output :
*
 * *
   * * *
     * * * *
       * * * * *
         * * * * * *
       * * * * *
     * * * *
   * * *
 * *
*
 */
package Programming_Fundamentals2;
import java.util.Scanner;
public class Arrow_Pattern {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int i,j,c1 = 0,c2 = 1,c3 = 1,c4 = 1;
		for(j=0;j < n/2;j++) {
	        for (i = 0; i < c1; i++) {
	            System.out.print(" ");
	        }
	        for (i = 1; i <= c2; i++) {
	            System.out.print("* ");
	        }
	        c1++;
	        c2++;

	        System.out.println();
	    }
	        for(j=n/2 + 1 ;j <= n;j++) {
	            for (i = c3; i < n/2 + 1; i++) {
	                System.out.print(" ");
	            }
	            for (i = c4; i <= n/2 + 1; i++) {
	                System.out.print("* ");
	            }
	            c3++;
	            c4++;

	            System.out.println();
	        }
	}
}
