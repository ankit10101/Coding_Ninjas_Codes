/*
Print ith Node

Given a linked list and a position i, print the node at ith position.
If position i is greater than length of LL, then don't print anything.
Indexing starts from 0.

Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer i (position)

Output format :
Element at ith position

Sample Input 1 :
3 4 5 2 6 1 9 -1
3

Sample Output 1 :
2

Sample Input 2 :
3 4 5 2 6 1 9 -1
0

Sample Output 2 :
3
 */
package linked_List_1;
import java.util.Scanner;
public class Print_ith_Node {

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
		int length = 0;
		LinkedListNode<Integer> temp = head;
		while(temp != null) {
			length++;
			temp = temp.next;
		}
		return length;
	}

	public static void printIth(LinkedListNode<Integer> head, int i){
		LinkedListNode<Integer> temp = head;
		if(i < 0 || i > length(head)) {
			return;
		}else {
			int c = 0;
			while(c <= i) {
				if(c == i)
				System.out.println(temp.getData());
				temp = temp.next;
				c++;
			}	
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedListNode<Integer> head = takeInput();
		printIth(head,s.nextInt());
	}
}
