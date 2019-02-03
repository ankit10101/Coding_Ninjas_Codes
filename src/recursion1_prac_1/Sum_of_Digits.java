/*
Sum of digits (recursive)

Write a recursive function that returns the sum of the digits of a given integer.

Sample Input :
12345

Sample Output :
15
 */
package recursion1_prac_1;
import java.util.Scanner;
public class Sum_of_Digits {
	
	public static int sumOfDigits(int input){
		if(input == 0){
          return 0;
        }
      return input % 10 + sumOfDigits(input / 10);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.print(sumOfDigits(s.nextInt()));
	}
}
