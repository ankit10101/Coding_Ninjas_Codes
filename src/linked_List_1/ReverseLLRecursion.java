package linked_List_1;

import java.util.Scanner;

public class ReverseLLRecursion {
    public static LinkedListNode<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        int data = s.nextInt();
        while (data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static LinkedListNode<Integer> reverseRecursively(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> remaining = reverseRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return remaining;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeInput();
        print(head);
        LinkedListNode<Integer> headReversed = reverseRecursively(head);
        print(headReversed);
    }
}
