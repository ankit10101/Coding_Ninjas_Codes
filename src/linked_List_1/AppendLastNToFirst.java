package linked_List_1;

import java.util.Scanner;

public class AppendLastNToFirst {

    public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) {
      LinkedListNode<Integer> head = nthNodeFromLastIter(root,n);
      LinkedListNode<Integer> temp = head,temp1 = root;
      while(temp1.next != head){
          temp1 = temp1.next;
      }
      while(temp.next != null){
          temp = temp.next;
      }
      temp.next = root;
      temp1.next = null;
      return head;
    }

    public static LinkedListNode<Integer> nthNodeFromLastIter(LinkedListNode<Integer> head, int n){
        LinkedListNode<Integer> main = head, ref = head;
        while(n-- != 0) {
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

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        LinkedListNode<Integer> head  = takeInput();
        int n = s.nextInt();
        head = append(head,n);
        print(head);
    }
}
