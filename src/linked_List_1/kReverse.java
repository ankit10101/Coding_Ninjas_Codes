package linked_List_1;

/*
kReverse
Send Feedback
Implement kReverse( int k ) in a linked list i.e. you need to reverse first K elements then reverse next k elements and join the linked list and so on.
Indexing starts from 0. If less than k elements left in the last, you need to reverse them as well. If k is greater than length of LL, reverse the complete LL.
You don't need to print the elements, just return the head of updated LL.
Input format :

Line 1 : Linked list elements (separated by space and terminated by -1)

Line 2 : k

Sample Input 1 :
1 2 3 4 5 6 7 8 9 10 -1
4
Sample Output 1 :
4 3 2 1 8 7 6 5 10 9
Sample Input 2 :
1 2 3 4 5 -1
2
Sample Output 2 :
2 1 4 3 5
Sample Input 3 :
1 2 3 4 5 6 7 -1
3
Sample Output 3 :
3 2 1 6 5 4 7
*/

import java.util.Scanner;

public class kReverse {

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
    }

    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        LinkedListNode<Integer> currentNode = head, previousNode = null, temp;
        while (currentNode.next != null) {
            for (int i = 1; i <= k && currentNode.next != null; i++) {
                temp = currentNode.next;
                currentNode.next = previousNode;
                previousNode = currentNode;
                currentNode = temp;
            }
            head = currentNode;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedListNode<Integer> head = takeInput();
        LinkedListNode<Integer> head1 = kReverse(head, s.nextInt());
        print(head1);
    }
}
