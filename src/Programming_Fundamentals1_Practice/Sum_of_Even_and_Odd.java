/*
Sum of even & odd

Write a program to input an integer N and print the sum of all its even digits and
sum of all its odd digits separately.
Digits means numbers not the places. That is, if the given integer is "13245", 
even digits are 2 & 4 and odd digits are 1, 3 & 5.

Input format :
 Integer N

Output format :
Sum_of_Even_Digits Sum_of_Odd_Digits
(Print first even sum and then odd sum separated by space)

Sample Input :
1234

Sample Output :
6 4
 */
package Programming_Fundamentals1_Practice;
import java.util.Scanner;
public class Sum_of_Even_and_Odd {

	public static void main(String[] args) {
		int n,sume = 0,sumo = 0 ,r,q;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		while (n!=0)
	    {
	        q = n/10;
	        r = n%10;
	        if(r % 2 == 0)
	        {
	            sume = sume + r;
	        }
	        else
	        {
	            sumo = sumo + r;
	        }
	        n = q;
	    }
	    System.out.print(sume + " " + sumo);

	}

}
