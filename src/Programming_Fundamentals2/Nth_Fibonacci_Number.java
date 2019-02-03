/*
Nth Fibonacci Number

Nth term of fibonacci series F(n) is calculated using following formula -
    F(n) = F(n-1) + F(n-2), 
Provided N you have to find out the Nth Fibonacci Number. Also F(1) = F(2) = 1.

Input Format :
Integer n

Output Format :
Nth Fibonacci term i.e. F(n)

Sample Input :
4

Sample Output :
3 
 */
package Programming_Fundamentals2;
import java.util.Scanner;
public class Nth_Fibonacci_Number {

	public static int findFibonacciN(int n){
        int y;
        if(n == 1)
            return 1;
            if(n == 2)
                return  1;
             y = findFibonacciN(n-1) + findFibonacciN(n-2);
            return y;
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = findFibonacciN(n);
        System.out.print(x);
	}
}
