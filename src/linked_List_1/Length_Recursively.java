/*
Length Recursively

Given a linked list, find and return the length of input LL recursively.

Input format :
Linked list elements (separated by space and terminated by -1)

Output format :
Length of LL

Sample Input :
3 4 5 2 6 1 9 -1

Sample Output :
7
 */
package linked_List_1;
import java.util.Scanner;
public class Length_Recursively {
	
	public static LinkedListNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		int data = s.nextInt();
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);	
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static int length(LinkedListNode<Integer> head){
		// We can even directly change head in recursion problems
		LinkedListNode<Integer> temp = head;
		if(temp == null) {
			return 0;
		}
		return length(temp.next) + 1;	
	}

	public static void main(String[] args) {
		LinkedListNode<Integer> head = takeInput();
		System.out.println(length(head));
	}
}
