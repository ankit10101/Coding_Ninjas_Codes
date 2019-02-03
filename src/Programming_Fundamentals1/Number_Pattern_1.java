/*
Number Pattern 1

Print the following pattern
Pattern for N = 4
1
23
345
4567

Input Format :
N (Total no. of rows)

Output Format :
Pattern in N lines

Sample Input 1 :
3

Sample Output 1 :
1
23
345
 */
package Programming_Fundamentals1;
import java.util.Scanner;
public class Number_Pattern_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int j;
		for(int i=1,c=1;i<=n;i++,c++)
		{
			for(j=i;j<=2*c-1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
