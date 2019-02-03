package linked_List_1;

import java.util.Scanner;

public class kReverse {

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

    }

    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
      LinkedListNode<Integer> prev = null, curr = head;
      if(head == null){
          return head;
      }


    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        LinkedListNode<Integer> head = takeInput();
        LinkedListNode<Integer> head1 = kReverse(head,s.nextInt());
        print(head1);
    }
}
