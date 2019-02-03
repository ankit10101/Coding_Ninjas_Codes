/*
Code: Balanced Parenthesis

Given a string expression, check if brackets present in the expression are balanced or not. 
Brackets are balanced if the bracket which opens last, closes first.
You need to return true if it is balanced, false otherwise.

Sample Input 1 :
{ a + [ b+ (c + d)] + (e + f) }

Sample Output 1 :
true

Sample Input 2 :
{ a + [ b - c } ]

Sample Output 2 :
false
 */
package stacks_and_queues;
import java.util.Scanner;
import java.util.Stack;
public class Balanced_Parenthesis {

	public static boolean checkBalanced(String exp) {
		Stack<Character> s = new Stack<>();
		for(int i = 0;i < exp.length() ;i++) {
			if((exp.charAt(i) == '(') || (exp.charAt(i) == '[') || (exp.charAt(i) == '{')) {
				s.push(exp.charAt(i));
			}else if(exp.charAt(i) == ')' ) {
				if(!s.isEmpty() && s.peek() == '(') {
					s.pop();
				}
				else {
					return false;
				}
			}
			else if(exp.charAt(i) == '}' ) {
				if(!s.isEmpty() && s.peek() == '{') {
					s.pop();
				}
				else {
					return false;
				}
			}
			else if(exp.charAt(i) == ']' ) {
				if(!s.isEmpty() && s.peek() == '[') {
					s.pop();
				}
				else {
					return false;
				}
			}
		}
		return s.isEmpty();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(checkBalanced(s.nextLine()));

	}

}
