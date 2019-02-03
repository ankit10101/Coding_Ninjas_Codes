/*
Multiplication (Recursive)

Given two integers m & n, calculate and return their multiplication using recursion. 
You can only use subtraction and addition for your calculation. No other operators are allowed.

Input format : 
m and n (in different lines)

Sample Input :
3 
5

Sample Output -
15
 */
package recursion1_prac_1;
import java.util.Scanner;
public class Multiplication_Recursive {
	
	public static int multiplyTwoIntegers(int m, int n){
		if(n == 1)
          return m;
        int result = m + multiplyTwoIntegers(m,n - 1);
	    return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(multiplyTwoIntegers(s.nextInt(),s.nextInt()));
	}

}
