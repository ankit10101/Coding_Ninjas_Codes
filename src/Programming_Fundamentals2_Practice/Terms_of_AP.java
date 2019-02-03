/*
Terms of AP

Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
N varies from 1 to 1000.

Input format :
Integer x

Output format :
Terms of series (separated by space)

Sample Input 1 :
10

Sample Output 1 :
5 11 14 17 23 26 29 35 38 41

Sample Input 2 :
4

Sample Output 2 :
5 11 14 17
 */
package Programming_Fundamentals2_Practice;
import java.util.Scanner;
public class Terms_of_AP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int c = 0,i=1;
        while(c!=x)
        {   if((3*i+2)%4!=0) {
            System.out.print(3 * i + 2 + " ");
            c++;
        }
            i++;
        }

	}

}
