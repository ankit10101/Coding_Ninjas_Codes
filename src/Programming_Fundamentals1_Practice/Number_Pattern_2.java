/*
Number Pattern 2

Print the following pattern for the given N number of rows.

Pattern for N = 4
1
11
202
3003

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Sample Input :
5

Sample Output :
1
11
202
3003
40004
 */
package Programming_Fundamentals1_Practice;
import java.util.Scanner;
public class Number_Pattern_2 {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        if(n == 1)
	            System.out.print("1");
	        else {
	            System.out.print("1\n" );
	            for (int i = 2; i <= n; i++) {
	                for (int j = 1; j <= i; j++) {
	                    if (j == 1 || j == i) {
	                        System.out.print(i-1);
	                    } else {
	                        System.out.print(0);
	                    }
	                }
	                System.out.print("\n");
	            }
	        }

	}

}
