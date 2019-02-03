/*
Number Pattern

Print the following pattern for the given number of rows.

Pattern for N = 3
333
233
123

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Sample Input :
5

Sample Output :
55555
45555
34555
23455
12345
 */
package Programming_Fundamentals2;
import java.util.Scanner;
public class Number_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c1 = n,c2 = 0;
		for(int i = n;i > 0;i--)
	    {
	        for(int j = i;j <= c1;j++)
	        {
	          System.out.print(j);
	        }
	        for(int k = n-1;k > c2;k--)
	        {
	            System.out.print(n);
	        }
	        c2++;
	        System.out.println();
	    }
	}

}
