/*
Roots of quadratic equation

Write a program to calculate the roots of a given quadratic equation -
    a(x^2) + bx + c = 0 
Print roots specifying their nature. If roots are imaginary, no need to print the roots.

Print the nature of roots in the form of an integer -
 0 : if roots are real & same
 1 : if roots are real & different
-1 : if roots are imaginary
Round off the roots and then print the integral part only i.e. without any decimal places.
You can assume that, input will always be a quadratic equation.

Input format :
a b c (separated by space)

Output format :
Line 1 : Nature of roots (0 or 1 or -1)
Line 2 : Root 1 and Root 2 (separated by space)

Sample Input 1 :
1 4 2

Sample Output 1 :
1
-1 -3

Sample Input 2 :
1 2 3

Sample Output 2 :
-1
*/
package Programming_Fundamentals1_Practice;
import java.util.Scanner;
public class Roots_of_Quadratic_Equation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a,b,c,d,r1,r2;
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		d = ((b*b)-(4*a*c));
		if(d > 0)
	    {
	        System.out.print(1 + "\n");
	        r1 =(-b+Math.sqrt(d))/(2*a);
	        r2 =(-b-Math.sqrt(d))/(2*a);
	        System.out.print(Math.round(r1) + " " + Math.round(r2));


	    }
	    else if(d == 0)
	    {  System.out.print(0 + "\n");
	       r1 = -b/(2*a);
	       r2 = -b/(2*a);
	       System.out.print((int)Math.round(r1) + " " + (int)Math.round(r2));
	    }
	    else
	    {
	        System.out.print(-1);
	    }

	}

}
