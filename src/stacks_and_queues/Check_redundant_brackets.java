/*
Check redundant brackets

Given a string mathematical expression, return true if redundant brackets are present in the expression. Brackets are redundant if there is nothing inside the bracket or more than one pair of brackets are present.
Assume the given string expression is balanced and contains only one type of bracket i.e. ().

Input Format :
String s (Expression)

Output Format :
true or false

Sample Input 1:
((a + b)) 

Sample Output 1:
true

Sample Input 2:
(a+b) 

Sample Output 2:
false
 */
package stacks_and_queues;
import java.util.Scanner;
import java.util.Stack;

public class Check_redundant_brackets {

	public static boolean checkRedundantBrackets(String input) {
		Stack<Character> s = new Stack<>();
		int count = 0;
		char ch1;
		for(int i = 0;i < input.length();i++) {
			char ch = input.charAt(i);
			s.push(ch);
			if(ch == ')') {
				while(!s.isEmpty()) {
					ch1 = s.pop();
					if(ch1 != '(' && ch1 != ')') {
						count++;
					}
					if(ch1 == '(') {
						break;
					}
				}
				if(count == 0) {
					return true;
				}
				count = 0;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(checkRedundantBrackets(s.nextLine()));
	}
}
