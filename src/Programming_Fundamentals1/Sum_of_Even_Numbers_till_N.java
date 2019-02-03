/*
Sum of Even Numbers till N

Given a number N, print sum of all even numbers from 1 to N.

Input Format :
Integer N

Output Format :
Required Sum 

Sample Input 1 :
 6

Sample Output 1 :
12
 */
package Programming_Fundamentals1;
import java.util.Scanner;
public class Sum_of_Even_Numbers_till_N {

	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
		int n ,sum = 0;
	    n = s.nextInt();
		for(int i=2;i<=n;i+=2)
	    {
	        sum = sum + i;
	    }
	    System.out.print(sum);
		}

	}

