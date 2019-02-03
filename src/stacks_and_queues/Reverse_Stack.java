/*
Reverse Stack

Reverse a given Stack with the help of another empty stack. 
Two stacks will be given. Out of which first contains some integers and second one is empty. 
You need to reverse the first one using second stack. Change in the given first stack itself.

Note : You don't need to print or return the stack, 
just reverse the given stack and it will be printed internally.

Input format :
Line 1 : Size of Stack
Line 2 : Stack elements (separated by space)

Sample Input 1 :
4 
1 2 3 4     (4 is at top)

Sample Output 1 :
1 2 3 4    (1 is at top)
 */
package stacks_and_queues;
import java.util.Stack;
public class Reverse_Stack {

	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
      if(s1.isEmpty()) {
    	  return;
      }
	  int val = s1.pop();
      reverseStack(s1, s2);
      while(!s1.isEmpty()) {
    	 s2.push(s1.pop()); 
      }
      s1.push(val);
      while(!s2.isEmpty()) {
    	  s1.push(s2.pop());
      }
	}

	public static void main(String[] args) {
	  Stack<Integer> s1 = new Stack<>();
	  Stack<Integer> s2 = new Stack<>();
	  s1.push(10);
	  s1.push(20);
	  s1.push(30);
	  s1.push(40);
	  s1.push(50);
	  System.out.println(s1);
	  reverseStack(s1, s2);
	  System.out.println(s1);

	}

}
