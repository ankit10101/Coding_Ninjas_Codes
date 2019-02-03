/*
Number Pattern 3
Print the following pattern for the given N number of rows.

Pattern for N = 4
1
11
121
1221

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Sample Input :
5

Sample Output :
1
11
121
1221
12221
 */
package Programming_Fundamentals1_Practice;
import java.util.Scanner;
public class Number_Pattern_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }
            }
            System.out.print("\n");
        }

	}

}
