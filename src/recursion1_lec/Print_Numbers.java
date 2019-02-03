/*
Print Numbers

Give the code to print number from 1 to n in increasing order recursively.
Input Format :
Integer n

Output Format :
Numbers from 1 to n (separated by space)

Constraints :
1 <= n <= 10000

Sample Input :
 6

Sample Output :
1 2 3 4 5 6
*/
package recursion1_lec;
import java.util.Scanner;
public class Print_Numbers {
	
	public static void print(int n){
		if(n == 0){
			return;
		}
		print(n - 1);
	    System.out.print(n+" ");
		}

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		print(s.nextInt());
	}

}
