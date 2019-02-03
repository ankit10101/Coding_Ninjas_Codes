/*
Count Zeros

Given an integer n, count and return the number of zeros that are present in the given integer 
using recursion.

Input Format :
Integer n

Output Format :
No. of 0s

Sample Input :
10204

Sample Output
2
 */
package recursion1_prac_1;
import java.util.Scanner;
public class Count_Zeroes {
	
	public static int countZerosRec(int input){
	      if(input == 0)
	        return 0;
	     if(input % 10 == 0){
	       return countZerosRec(input / 10) + 1;
	     }
	     else{
	       return countZerosRec(input / 10);
	     }
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(countZerosRec(s.nextInt()));

	}

}
