/*
Number of Digits

Give the code to find out and return the number of digits present in a number recursively.

Input Format :
Integer n

Output Format :
Count of digits

Constraints :
1 <= n <= 10^6

Sample Input :
156

Sample Output :
3
 */
package recursion1_lec;
import java.util.Scanner;
public class Number_of_Digits {
	
	public static int count(int n){
		if(n == 0){
			return 0;
		}
		int smallAns = count(n / 10);
		return smallAns + 1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r = count(s.nextInt());
        System.out.println(r);
	}

}
