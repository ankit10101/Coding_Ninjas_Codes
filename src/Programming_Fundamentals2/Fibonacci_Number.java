/*
Fibonacci Number

Given a number N, figure out if it is a member of fibonacci series or not. 
Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)

Input Format :
Integer N

Output Format :
true or false

Sample Input 1 :
5

Sample Output 1 :
true

Sample Input 2 :
14

Sample Output 2 :
false    
 */
package Programming_Fundamentals2;
import java.util.Scanner;
public class Fibonacci_Number {
	
	public static boolean isPerfectSquare(int x){
        int y = (int)Math.sqrt(x);
        if (y*y == x)
            return true;
            else
                return false;
    }
	
	public static boolean checkMember(int n){
       if(isPerfectSquare(5*n*n-4) || isPerfectSquare(5*n*n+4))
            return true;
        else
            return false;

	}

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
		boolean checkMember = checkMember(n);
		System.out.print(checkMember);
	}

}
