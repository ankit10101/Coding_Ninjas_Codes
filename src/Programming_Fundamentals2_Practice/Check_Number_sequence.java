/*
 Check Number sequence

You are given S a sequence of n integers i.e. S = s1, s2, ..., sn.
Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, �.., sn (0 <= i <= n) 
in such a way that the first part is strictly decreasing while the second is strictly increasing one.
That is, in the sequence if numbers are decreasing, they can start increase at one point. 
And once number starts increasing, they cannot decrease at any point further.
Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence. 
So in both the cases, print true.
You just need to print true/false. No need to split the sequence.

Input format :
Line 1 : Integer n
Line 2 : n integers (separated by space)

Output Format :
"true" or "false" (without quotes)

Sample Input 1 :
5
9 8 4 5 6

Sample Output 1 :
true

Sample Input 2 :
3
1 2 3

Sample Output 2 :
true

Sample Input 3 :
3
8 7 6

Sample Output 3 :
true

Sample Input 4 :
6
8 7 6 5 8 2

Sample Output 4 :
false
 */
package Programming_Fundamentals2_Practice;
import java.util.Scanner;
public class Check_Number_sequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[100];
		int i,j;
		boolean flag1 = true, flag2 = true,flag3 = false,flag = false;
		for(i = 0;i < n;i++){
		    a[i] = s.nextInt();
	    }
	    for(i = 0;i < n - 1;i++){
	        if(a[i+1] < a[i]){

	        }
	        else
	        {   flag1 = false;
	            break;
	        }
	    }
	        for(i = 0;i < n - 1;i++){
	            if(a[i+1] > a[i]){

	            }
	            else
	            {   flag2 = false;
	                break;
	            }
	        }

	    if(flag1 == false && flag2 == false) {
	        flag3 = true;
	        for (i = 0; i < n - 1; i++) {
	            if (a[i + 1] < a[i]) {

	            } else {
	                flag = false;
	                break;
	            }
	        }
	        for(j = i;j < n - 1;j++)
	        {
	            if(a[j+1] > a[j]){
	            flag = true;
	        }
	        else
	            {   flag = false;
	                break;
	            }

	        }
	    }
	    if(flag3 !=true)
	    System.out.print(flag1 || flag2);
	    if(flag3 == true)
		System.out.print(flag);	

	}

}
