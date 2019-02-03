/*
Triangle of Numbers

Print the following pattern for the given number of rows.

Pattern for N = 3
  1
 232
34543

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Sample Input :
5

Sample Output :
    1
   232
  34543
 4567654
567898765
 */
package Programming_Fundamentals1;
import java.util.Scanner;
public class Triangle_of_Numbers {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int N;
	        N = s.nextInt();
	        int j,k,m=N,p=N,l,x,y=0,z=1;

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
	            for(x=y;x>=z;x--)
	            {
	                System.out.print(x);
	            }
	            System.out.println();
	            m--;
	            y=y+2;
	            z++;

	        }

	}

}
