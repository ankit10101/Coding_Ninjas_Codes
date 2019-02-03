/*
Number Star Pattern 2

Print the following pattern for given number of rows.

Input format :
Line 1 : N (Total number of rows)

Sample Input :
   5

Sample Output :
1234554321
1234**4321
123****321
12******21
1********1
 */
package test1;
import java.util.Scanner;
public class Number_Star_Pattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c1 = n,j,c2 = n-1,c3 = n;
		for(int i = n;i >= 1;i--){
		    for(j = 1;j <= c1;j++){
		        System.out.print(j);
	        }
		    for(j = c2;j < n-1;j++){
		        System.out.print("**");
	        }
	        for(j = c3;j >= 1;j--){
	            System.out.print(j);

	        }
	        c1--;
		    c2--;
		    c3--;
		    System.out.println();
	    }	


	}

}
