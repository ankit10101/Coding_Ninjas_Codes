package linked_List_1;

public class ContainsLoop {

    public boolean hasCycle(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
