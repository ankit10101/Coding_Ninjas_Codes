/*
Sum of N Natural Numbers

Given an integer n, find and return the sum of numbers from 1 to n using recursion.

Input Format :
Integer n

Output Format :
Sum

Constraints :
1 <= n <= 10^3

Sample Input :
10

Sample Output :
55
 */
package recursion1_lec;
import java.util.Scanner;
public class Sum_of_N_Natural_Numbers {
	
	public static int sum(int n) {
        if(n == 0)
          return 0;
		int s = sum(n - 1);
        int r = n + s;
        return r;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r = sum(s.nextInt());
		System.out.println(r);
	}
}
