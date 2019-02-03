/*
Reverse of a number

Write a program to generate the reverse of a given number N. Print the corresponding reverse number.

Input format :
Integer N

Output format :
Corresponding reverse

Sample Input 1 :
1234

Sample Output 1 :
4321

Sample Input 2 :
1980

Sample Output 2 :
891
 */
package Programming_Fundamentals2_Practice;
import java.util.Scanner;
public class Reverse_of_a_Number {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int r, q, c = 0;
	        if(n==0)
	        {
	            System.out.print(0);
	        }
	        else {
	            while (n != 0) {
	                r = n % 10;
	                q = n / 10;
	                n = q;
	                if (r == 0 && c == 0) {
	                    continue;
	                }
	                System.out.print(r);
	                c++;
	            }
	        }

	}

}
