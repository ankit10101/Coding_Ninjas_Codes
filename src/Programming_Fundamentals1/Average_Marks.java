/*
Average Marks

Write a program to input name (as a single character) and 
marks of three tests of a student (all integers). 
Then calculate and print the name and average (integer) of all test marks.
All the test marks are integers and calculate average also as integer. 
That is, you need to print the integer part of average only, neglect the decimal part.

Input format :
Line 1 : Name (Single character)
Line 2 : 3 Test marks (separated by space)

Output format :
Name Average (in different lines)

Sample Input 1 :
A
3 4 6

Sample Output 1 :
A
4
 */
package Programming_Fundamentals1;
import java.util.Scanner;
public class Average_Marks {

	public static void main(String[] args) {
		char name;
        int marks1,marks2,marks3,avg;
        Scanner s = new Scanner(System.in);
        name =  s.next().charAt(0);
        marks1 = s.nextInt();
        marks2 = s.nextInt();
        marks3 = s.nextInt();
        avg = (marks1 + marks2 + marks3 )/3;
        System.out.println(name);
        System.out.println(avg);

	}

}
