/*
Pyramid Number Pattern 1

Print the following pattern for the given number of rows.

Pattern for N = 4
   1
  212
 32123
4321234

Input format : N (Total no. of rows)

Output format : Pattern in N lines

Sample Input :
5

Sample Output :
    1
   212
  32123
 4321234
543212345
 */
package test1;
import java.util.Scanner;
public class Pyramid_Number_Pattern1 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int i,j,c1 = n-1,c2 = 1,c3 = 1;
			for(i = 1;i <= n;i++){
			    for(j = c1;j > 0;j--){
			        System.out.print(" ");
		        }
		        for(j = c2;j >= 2;j--){
		            System.out.print(j);
		        }
		        for(j = 1;j <= c3;j++){
		            System.out.print(j);
		        }
		    c1--;
		    c2++;
		    c3++;
		    System.out.println();
		    }		

	}

}
