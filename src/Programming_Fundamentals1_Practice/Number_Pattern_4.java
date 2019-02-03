/*
Number Pattern 4

Print the following pattern for the given N number of rows.

Pattern for N = 4
1234
123
12
1

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Sample Input :
5

Sample Output :
12345
1234
123
12
1
 */
package Programming_Fundamentals1_Practice;
import java.util.Scanner;
public class Number_Pattern_4 {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int n =s.nextInt();
	        for(int i = n;i > 0;i--)
	        {
	            for(int j = 1; j <= i; j++)
	            {
	                System.out.print(j);
	            }
	            System.out.println();
	        }

	}

}
