/*
 Find an Element Recursively
Send Feedback
Given a linked list and an integer n you need to find and return index where n is present in the LL. Do this recursively.
Return -1 if n is not present in the LL.
Indexing of nodes starts from 0.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer n 
Output format :
Index
Sample Input 1 :
3 4 5 2 6 1 9 -1
5
Sample Output 1 :
2
Sample Input 2 :
3 4 5 2 6 1 9 -1
6
Sample Output 2 :
4
 */
package linked_List_1;
import java.util.Scanner;
public class Find_an_Element_Recursively {

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

	public static int indexOfNRec1(LinkedListNode<Integer> head, int n ,int pos) {
		if(head == null){
			return -1;
		}
		if(head.getData() == n){
			return pos;
		}
		return indexOfNRec1(head.next,n,pos + 1);

	}  

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedListNode<Integer> head = takeInput();
		int n = s.nextInt();
		System.out.println(indexOfNRec1(head,n,0));
	}
}
