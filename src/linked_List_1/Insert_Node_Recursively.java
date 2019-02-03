package linked_List_1;
import java.util.Scanner;
public class Insert_Node_Recursively {
	
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
	
	public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int data, int pos){
		if(head == null) {
			if(pos == 0) {
				LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
				head = newNode;
			}
			return head;
		}
		if(pos == 0) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			newNode.next = head;
			head = newNode;
			return head;
			
		}else {
			head.next = insertR(head.next, data, pos - 1);
			return head; 
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedListNode<Integer> head = takeInput();
        LinkedListNode<Integer> head1 = insertR(head,s.nextInt(),s.nextInt());
        print(head1);
	}
}
