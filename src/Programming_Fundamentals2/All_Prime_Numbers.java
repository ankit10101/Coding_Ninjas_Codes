/*
All Prime Numbers

Given an integer N, print all the prime numbers that lies in between 2 to N (both inclusive).
Print the prime numbers in different lines.

Input Format :
Integer N

Output Format :
Prime number in different lines

Constraints :
1 <= N <= 100

Sample Input :
9

Sample Output :
2
3
5
7
 */
package Programming_Fundamentals2;
import java.util.Scanner;
public class All_Prime_Numbers {
	
	 public static boolean checkPrime(int x) {
	        boolean isPrime = true;
	        for (int i = 2; i < x; i++) {
	            if (x % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        return isPrime;
	    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        boolean isPrime;
        for (int i = 2; i <= N; i++) {
            isPrime = checkPrime(i);
            if (isPrime == true) {
                System.out.println(i);
            }
        }
	}
}
