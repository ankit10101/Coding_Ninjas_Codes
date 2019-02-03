/*
Count Words

Given a string S, count number of words in the string.

Note : Assume there is single space between two words and there are no extra spaces before and after words.

Input Format :
 String S

Output Format :
Count of words

Sample Input :
this is a sample string

Sample Output :
5
 */
package strings_and_2D_arrays;
import java.util.Scanner;
public class Count_Words {

	public static int countWords(String str){
		int noOfWords = 1;
		for(int i = 0;i < str.length();i++) {
			if(str.charAt(i) == ' ')
				noOfWords++;
		}
		return noOfWords;
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str = s.nextLine();
		int noOfWords = countWords(str);
		System.out.print(noOfWords);
	}

}
