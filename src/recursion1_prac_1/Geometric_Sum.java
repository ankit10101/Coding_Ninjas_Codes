/*
Geometric Sum

Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
using recursion. Return the answer.

Sample Input :
3

Sample Output :
1.875
 */
package recursion1_prac_1;
import java.util.Scanner;
public class Geometric_Sum {
	
	public static double findGeometricSum(int k){
		if(k==0){
          return 1;
        }
        return findGeometricSum(k - 1)+(1 / Math.pow(2,k));

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(findGeometricSum(s.nextInt()));

	}

}
