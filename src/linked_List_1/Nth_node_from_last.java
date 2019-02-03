/*
Nth Node from last

Given a linked list and an integer n you need to find and return the nth node from last 
without calculating length of input linked list.
Return null if length of LL is smaller than n.
Counting of nodes starts from 0.

Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer n 

Output format :
nth node from last

Sample Input 1 :
3 4 5 2 6 1 9 -1
0

Sample Output 1 :
9

Sample Input 2 :
3 4 5 2 6 1 9 -1
4

Sample Output 2 :
5
 */
package linked_List_1;
import java.util.Scanner;
public class Nth_node_from_last {

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
	
	public static int getLength(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		int count = 0; 
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static LinkedListNode<Integer> nthNodeFromLastIter(LinkedListNode<Integer> head, int n){
        LinkedListNode<Integer> main = head, ref = head;
        while(n-- != -1) {
        	ref = ref.next;
        	if(ref == null)
        		return null;
        }
        while(ref != null) {
        	main = main.next;
        	ref = ref.next;
        }
        return main;
	}

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		LinkedListNode<Integer> head = takeInput();
		System.out.print(nthNodeFromLastIter(head, s.nextInt()).getData());
	}

}
