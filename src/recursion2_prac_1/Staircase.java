/*
Staircase
A child is running up a staircase with n steps, and can hop either 1 step, 2 steps or 3 steps at a time. 
Implement a method to count how many possible ways the child can run up to the stairs. 
You need to return all possible number of ways.

Input format :
Integer n (No. of steps)

Constraints :
n <= 30

Sample Input 1:
4

Sample Output 1:
7
 */
package recursion2_prac_1;
import java.util.Scanner;
public class Staircase {
	
	public static int findWays(int n){
	      if(n == 0){
	          return 0;
	      }
	      if(n ==1){
	         return 1;
	      }
	      if(n == 2){
	        return 2;
	      }
	      if(n == 3){
	        return 4;
	      }
	      int y = findWays(n - 1) + findWays(n - 2) + findWays(n-3);
	      return y;
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(findWays(s.nextInt()));
	}
}
