/*
Trailing Zeros in Factorial

Given an integer n, find the number of trailing 0s in its factorial. 
Do this without actually finding the n!, as the integer given can be large and 
its factorial can exceed the integer limits.

Input format :
Integer n  

Output Format :
Count of trailing 0s

Constraints :
1 <= n <= 0^11

Sample Input
50

Sample Output
12   
 */
package Programming_Fundamentals2;
import java.util.Scanner;
public class Trailing_Zeros_in_Factorial {
	
	 public static int findMaxPower(int n ,int m)
	    {   int r,q,s = 0;
	        while(n!=0)
	        {
	            q = n / m;
	            r = n % m;
	            s+=q;
	            n = q;
	        }
	        return s;
	    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int s2 = findMaxPower(n,2);
	    int s5 = findMaxPower(n,5);
	    if (s2 < s5)
	        System.out.print(s2);
	    else
	        System.out.print(s5);

	}

}
