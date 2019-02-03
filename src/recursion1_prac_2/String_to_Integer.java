/*
String to Integer

Write a recursive function to convert a given string into the number it represents. 
That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.

Input format :
Numeric string (string, Eg. "1234")

Output format :
Corresponding integer (int, Eg. 1234)

Sample Input 1 :
1231

Sample Output 1:
1231

Sample Input 2 :
12567

Sample Output 2 :
12567
 */
package recursion1_prac_2;
import java.util.Scanner;
public class String_to_Integer {
	
	public static int convertStringToInt(String input){
		return convertStringToInteger(input,input.length()-1); 

	}
    public static int convertStringToInteger(String input,int i){
      if(input.length() == 0){
          return 0;
        }
        return ((int)input.charAt(0) - 48)*(int)(Math.pow(10,i)) + convertStringToInteger(input.substring(1),i - 1);

    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(convertStringToInt(s.nextLine()));

	}

}
