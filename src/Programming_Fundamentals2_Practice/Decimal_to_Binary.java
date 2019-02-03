/*
Decimal to Binary

Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.

Note : The given input number could be large, so the corresponding binary number can exceed 
the integer range. So take the answer as long.

Input format :
Integer N

Output format :
Corresponding Binary number (long)

Sample Input 1 :
12

Sample Output 1 :
1100

Sample Input 2 :
7

Sample Output 2 :
111
 */
package Programming_Fundamentals2_Practice;
import java.util.Scanner;
public class Decimal_to_Binary {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int r,q,i = 0;
	        int[] arr = new int[100];
	        while(n!=0)
	        {
	            r = n % 2;
	            q = n / 2;
	            n = q;
	            arr[i] = r;
	            i++;
	        }
	        for(int j= i-1;j >= 0;j--)
	        {
	            System.out.print(arr[j]);
	        }


	}

}
