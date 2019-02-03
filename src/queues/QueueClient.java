package queues;

public class QueueClient {

	public static void main(String[] args) throws QueueEmptyException,QueueFullException {
		Queue<Integer> q = new Queue<>();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		System.out.println(q.getSize());
		System.out.println(q.deQueue());
		System.out.println(q.getSize());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		

	}

}
