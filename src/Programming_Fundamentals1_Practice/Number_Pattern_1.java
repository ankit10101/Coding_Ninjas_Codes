/*
Number Pattern 1

Print the following pattern for the given N number of rows.

Pattern for N = 4
1
11
111
1111

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Sample Input :
5

Sample Output :
1
11
111
1111
11111
 */
package Programming_Fundamentals1_Practice;
import java.util.Scanner;
public class Number_Pattern_1 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        for (int i=1;i<=n;i++)
	        {
	            for (int j=1;j<=i;j++)
	            {
	                System.out.print(1);
	            }
	            System.out.println();
	        }

	}

}
