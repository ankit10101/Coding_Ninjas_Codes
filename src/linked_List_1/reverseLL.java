package linked_List_1;

import java.util.Scanner;

public class reverseLL {

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
            System.out.print(temp.getData() + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> prev = null, curr = head, temp = head;
        if(head == null){
            return null;
        }
        while(curr.next != null){
           temp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = temp;
        }
        head = curr;
        head.next = prev;
        return head;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedListNode<Integer> head = takeInput();
        head = reverse(head);
        print(head);
    }
}
