/*
Number Pattern 2

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

Sample Input :
5

Sample Output :
    1
   23
  345
 4567
56789
 */
package Programming_Fundamentals1;
import java.util.Scanner;
public class Number_Pattern_2 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
			int N;
			N = s.nextInt();
		        int j,k,m=N;

		        for(int i=1,c=1;i<=N;i++,c++)
		        {
		            for(k=1;k<m;k++)
		            {
		                System.out.print(" ");
		            }
		            for(j=i;j<=2*c-1;j++)
		            {
		                System.out.print(j);
		            }
		            System.out.println();
		            m--;
		        }

	}

}
