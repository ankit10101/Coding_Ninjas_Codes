/*
Sum or Product

Write a program that asks the user for a number N and a choice C. 
And then give him the possibility to choose between computing the sum and 
computing the product of 1 ,..., N.
If user enters C is equal to -
 1 : Print sum of 1 to N numbers
 2 : Print product of 1 to N numbers
 Any other number : print -1

Input format :
Line 1 : Integer N
Line 2 : Choice C (1 or 2)

Output Format :
Sum or product according to user's choice

Sample Input 1 :
10
1

Sample Output 1 :
55

Sample Input 2 :
10
2

Sample Output 2 :
3628800

Sample Input 3 :
10
4

Sample Output 3 :
-1
 */
package Programming_Fundamentals2_Practice;
import java.util.Scanner;
public class Sum_or_Product {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0,product = 1;
		int n = s.nextInt();
		int choice = s.nextInt();
		for(int i = 1; i <= n;i++)
	    {
	        sum = sum + i;
	    }
	    for(int i = 1; i <= n;i++)
	    {
	        product = product * i;
	    }
		if(choice == 1)
	    {
	        System.out.print(sum);
	    }
	    else if (choice == 2)
	    {
	        System.out.print(product);
	    }
	    else
	    {
	        System.out.print(-1);
	    }

	}

}
