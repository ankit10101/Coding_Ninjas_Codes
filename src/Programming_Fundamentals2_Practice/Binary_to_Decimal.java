/*
Binary to decimal

Given a binary number as an integer N, convert it into decimal and print.

Input format :
An integer N

Output format :
Corresponding Decimal number (as integer)

Sample Input 1 :
1100

Sample Output 1 :
12

Sample Input 2 :
111

Sample Output 2 :
7
 */
package Programming_Fundamentals2_Practice;
import java.util.Scanner;
public class Binary_to_Decimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0,i = 0,r,q;
        while(n != 0)
        {   r = n % 10;
            q = n / 10;
            sum=sum+(r*(int)Math.pow(2,i));
            i++;
            n = q;
        }
        System.out.print(sum);

	}

}
