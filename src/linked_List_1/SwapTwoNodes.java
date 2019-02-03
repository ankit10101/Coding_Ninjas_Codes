/*
Swap two Node of LL

Given a linked list, i & j, swap the nodes that are present at i & j position in the LL. 
You need to swap the entire nodes, not just the data.
Indexing starts from 0. You don't need to print the elements, 
just swap and return the head of updated LL.
Assume i & j given will be within limits. And i can be greater than j also.

Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : i and j (separated by space)

Sample Input 1 :
3 4 5 2 6 1 9 -1
3 4

Sample Output 1 :
3 4 5 6 2 1 9

Sample Input 2 :
3 4 5 2 6 1 9 -1
2 4

Sample Output 2 :
3 4 6 2 5 1 9
 */
package linked_List_1;
import java.util.Scanner;
public class SwapTwoNodes {

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
			System.out.print(temp.getData() + " ");
			temp = temp.next;
		}
	}

	public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int i,int j){
		if(i == j) {
			return head;
		}
		LinkedListNode<Integer> prevI = null, currI = head;
		while(i-- != 0 && currI != null) {
			prevI = currI;
			currI = currI.next;
		}
		LinkedListNode<Integer> prevJ = null, currJ = head;
		while(j-- != 0 && currJ != null) {
			prevJ = currJ;
			currJ = currJ.next;
		}
		if(currI == null || currJ == null) {
			return head;
		}
		if (prevI != null) 
			prevI.next = currJ; 
		else
			head = currJ; 
		if (prevJ != null) 
			prevJ.next = currI; 
		else 
			head = currI;  
		LinkedListNode<Integer> temp = currI.next; 
		currI.next = currJ.next; 
		currJ.next = temp; 
		return head;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedListNode<Integer> head  = takeInput();
		swap_nodes(head, s.nextInt(), s.nextInt());
		print(head);	
	}
}
