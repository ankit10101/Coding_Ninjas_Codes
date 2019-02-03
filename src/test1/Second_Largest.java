/*
Second Largest

Take input a stream of n integer elements, find the second largest element present.
The given elements can contain duplicate elements as well. 
If only 0 or 1 element is given, the second largest should be INT_MIN ( - 2^31 ).

Input format :
Line 1 : Total number of elements (n)
Line 2 : N elements (separated by space)

Sample Input 1:
 4
 3 9 0 9

Sample Output 1:
 3

Sample Input 2 :
 2
 4 4

Sample Output 2:
 -2147483648

Sample Output Explanation:
Since both the elements are equal here, hence second largest element is INT_MIN i.e. ( -2^31 )
 */
package test1;
import java.util.Scanner;
public class Second_Largest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int a,b,i,max,max2,t,n,j = 0;
        n = s.nextInt();
        if(n == 0)
        {
            System.out.print(Integer.MIN_VALUE);
            return;
        }
        a = s.nextInt();
        if(n == 1)
        {
            System.out.print(Integer.MIN_VALUE);
            return;
        }
        b = s.nextInt();
        if(a<b){
            t=a;
            a=b;
            b=t;
        }
        max = a;
        max2 = b;
        while(j < n - 2)
        {
            i = s.nextInt();
            if(i > max)
            {
                max2 = max;
                max = i;
            }
            else if(i > max2 && i != max)
            {
                max2 = i;
            }
            else;
            j++;
        }
        if(max2 == max)
            System.out.print(Integer.MIN_VALUE);
        else
        System.out.print(max2);

	}

}
