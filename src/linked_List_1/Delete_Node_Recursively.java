/*
Delete Node Recursively

Given a linked list and a position i, delete the node of ith position from Linked List recursively.
If position i is greater than length of LL, then you should return the same LL without any change.
Indexing starts from 0. You don't need to print the elements, 
just delete the node and return the head of updated LL.

Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer i (position)

Output format :
Updated LL elements (separated by space)

Sample Input 1 :
3 4 5 2 6 1 9 -1
3

Sample Output 1 :
3 4 5 6 1 9

Sample Input 2 :
3 4 5 2 6 1 9 -1
0

Sample Output 2 :
4 5 2 6 1 9
 */
package linked_List_1;
import java.util.Scanner;
public class Delete_Node_Recursively {
	
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
	
	public static LinkedListNode<Integer> deleteIthNodeRec(LinkedListNode<Integer> head, int i){
		if(head == null || i > length(head)) {
			return head;
		}
		if(i == 0) {
			head = head.next;
			return head;
		}else {
			head.next = deleteIthNodeRec(head.next,i - 1);
			return head;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedListNode<Integer> head = takeInput();
		LinkedListNode<Integer> head1 =  deleteIthNodeRec(head,s.nextInt());
		print(head1);
	}
}
