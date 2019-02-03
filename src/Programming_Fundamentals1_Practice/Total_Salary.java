/*
Total Salary

Write a program to calculate the total salary of a person. 
The user has to enter the basic salary (an integer) and 
the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.

Input format :
Basic salary & Grade (separated by space)

Output Format :
Total Salary

Sample Input 1 :
10000 A

Sample Output 1 :
17600

Sample Input 2 :
4567 B

Sample Output 2 :
8762
 */
package Programming_Fundamentals1_Practice;
import java.util.Scanner;
public class Total_Salary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int basic = s.nextInt();
        char grade = s.next().charAt(0);
        double hra = (double)basic/5;
        double da = (double)basic/2;
        double pf = (double)(11*basic)/100;
        double allow;
        double totalSalary;
        if (grade == 'A')
            allow = 1700;
        else if(grade == 'B')
            allow = 1500;
        else
            allow = 1300;
        totalSalary = Math.round(basic + hra + da + allow - pf);
        int value = (int)totalSalary;
        System.out.print(value);

	}

}
