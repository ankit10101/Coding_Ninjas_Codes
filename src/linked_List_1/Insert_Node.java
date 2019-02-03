/*
Insert Node

Given a linked list, an integer n and a position i, insert that node n into Linked List at ith position.
If position i is greater than length of LL, you should return the same LL without any change.
Indexing starts from 0. You don't need to print the elements, just insert and return the head of updated
LL.

Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer i (position)
Line 3 : Integer n (Node to be inserted)

Output format :
Updated LL elements (separated by space)

Sample Input 1 :
3 4 5 2 6 1 9 -1
3
100

Sample Output 1 :
3 4 5 100 2 6 1 9

Sample Input 2 :
3 4 5 2 6 1 9 -1
0
20

Sample Output 2 :
20 3 4 5 2 6 1 9
 */
package linked_List_1;
import java.util.Scanner;
public class Insert_Node {
	
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

	public static void print(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		while(temp != null) {
			System.out.println(temp.getData());
			temp = temp.next;
		}
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
	
	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int data, int pos){
		LinkedListNode<Integer> temp = head;
		if(pos < 0 || pos > length(head)) {
			return head;
		}
		else {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if(pos == 0) {
				newNode.next = head;
				head = newNode;
				return head;
			}
			int c = 0;
			while(c < pos - 1) {
				c++;
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			return head;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedListNode<Integer> head  = takeInput();
		LinkedListNode<Integer> head1 = insert(head,s.nextInt(),s.nextInt());
		print(head1);		
	}
}
