/*
Star Pattern

Print the following pattern
Pattern for N = 4
    *
   *** 
  *****
 *******
Input Format :
N (Total no. of rows)

Output Format :
Pattern in N lines

Sample Input 1 :
3

Sample Output 1 :
   *
  *** 
 *****
 */
package Programming_Fundamentals1;
import java.util.Scanner;
public class Star_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N;
        N = s.nextInt();
        int j,k,m=N,p=N,l,x=N;

        for(int i=1,c=1;i<=N;i++,c++)
        {
            for(k=1;k<m;k++)
            {
                System.out.print(" ");
            }
            for(j=i;j<=2*c-1;j++)
            {
                System.out.print("*");
            }
            for(l=x;l<p;l++)
            {
                System.out.print("*");
            }
            System.out.println();
            m--;
            x--;
        }

	}

}
