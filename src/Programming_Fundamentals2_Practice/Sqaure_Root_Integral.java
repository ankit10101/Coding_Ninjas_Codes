/*
Square Root (Integral)

Given a number N, find its square root. You need to find and print only the integral part of square root
of N.
For eg. if number given is 18, answer is 4.

Input format :
Integer N

Output Format :
Square root of N (integer part only)

Sample Input 1 :
10

Sample Output 1 :
3

Sample Input 2 :
4

Sample Output 2 :
2
 */
package Programming_Fundamentals2_Practice;
import java.util.Scanner;
public class Sqaure_Root_Integral {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int i;
	        for(i = 1;;i++){
	            if((i*i) > n)
	                break;
	        }
	        System.out.print(i-1);
	}
}
