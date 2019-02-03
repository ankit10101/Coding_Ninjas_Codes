/*
Find power of a number

Write a program to find x to the power n (i.e. x^n). Take x and n from the user.
 You need to print the answer.

Input format :
Two integers x and n (separated by space)

Output Format :
x^n (i.e. x raise to the power n)

Sample Input 1 :
 3 4

Sample Output 1 :
81

Sample Input 2 :
 2 5
Sample Output 2 :
32
 */
package Programming_Fundamentals1_Practice;
import java.util.Scanner;
public class Find_Power_of_a_Number {

	public static void main(String[] args) {
		int x,n,p=1;
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		n = s.nextInt();
		for (int i=0;i<n;i++ )
	    {
	      p=p*x;
	    }
	    System.out.print(p);

	}

}
